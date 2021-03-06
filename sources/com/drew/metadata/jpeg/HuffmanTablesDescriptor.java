package com.drew.metadata.jpeg;

import com.drew.metadata.TagDescriptor;

public class HuffmanTablesDescriptor extends TagDescriptor<HuffmanTablesDirectory> {
    public HuffmanTablesDescriptor(HuffmanTablesDirectory huffmanTablesDirectory) {
        super(huffmanTablesDirectory);
    }

    public String getDescription(int i) {
        if (i != 1) {
            return super.getDescription(i);
        }
        return getNumberOfTablesDescription();
    }

    public String getNumberOfTablesDescription() {
        Integer integer = ((HuffmanTablesDirectory) this._directory).getInteger(1);
        if (integer == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(integer);
        sb.append(integer.intValue() == 1 ? " Huffman table" : " Huffman tables");
        return sb.toString();
    }
}
