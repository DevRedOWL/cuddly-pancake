package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.uimanager.ReactShadowNode;
import com.horcrux.svg.VirtualNode;

class DefsShadowNode extends DefinitionShadowNode {
    DefsShadowNode() {
    }

    public void draw(Canvas canvas, Paint paint, float f) {
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                reactShadowNode.markUpdateSeen();
                if (reactShadowNode instanceof VirtualNode) {
                    ((VirtualNode) reactShadowNode).traverseChildren(this);
                } else if (reactShadowNode instanceof SvgViewShadowNode) {
                    ((SvgViewShadowNode) reactShadowNode).traverseChildren(this);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void saveDefinition() {
        traverseChildren(new VirtualNode.NodeRunnable() {
            public void run(ReactShadowNode reactShadowNode) {
                if (reactShadowNode instanceof VirtualNode) {
                    ((VirtualNode) reactShadowNode).saveDefinition();
                }
            }
        });
    }
}
