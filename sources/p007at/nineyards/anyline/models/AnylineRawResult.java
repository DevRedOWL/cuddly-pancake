package p007at.nineyards.anyline.models;

import java.util.HashMap;
import java.util.Set;
import p007at.nineyards.anyline.core.CoreResult;
import p007at.nineyards.anyline.core.Map_Integer_Vector_SymbolConfidence;
import p007at.nineyards.anyline.core.Vector_String;

/* renamed from: at.nineyards.anyline.models.AnylineRawResult */
public class AnylineRawResult {

    /* renamed from: a */
    private final HashMap<String, String> f485a;

    /* renamed from: b */
    private final HashMap<String, Integer> f486b;

    /* renamed from: c */
    private final HashMap<String, Map_Integer_Vector_SymbolConfidence> f487c;

    /* renamed from: d */
    private boolean f488d;

    public AnylineRawResult() {
        this.f485a = new HashMap<>();
        this.f486b = new HashMap<>();
        this.f487c = new HashMap<>();
    }

    public AnylineRawResult(CoreResult coreResult) {
        this();
        Vector_String identifiers = coreResult.identifiers();
        int size = (int) identifiers.size();
        for (int i = 0; i < size; i++) {
            String str = identifiers.get(i);
            this.f485a.put(str, coreResult.getResult(str));
            if (coreResult.wordConfidenceByIdentifiers() != null && !coreResult.wordConfidenceByIdentifiers().empty() && coreResult.wordConfidenceByIdentifiers().has_key(str)) {
                this.f486b.put(str, Integer.valueOf(coreResult.wordConfidenceByIdentifiers().get(str)));
            }
            if (coreResult.symbolConfidenceVectorByIdentifiers() != null && !coreResult.symbolConfidenceVectorByIdentifiers().empty() && coreResult.symbolConfidenceVectorByIdentifiers().has_key(str)) {
                this.f487c.put(str, coreResult.getSymbolConfidence(str));
            }
        }
        this.f488d = coreResult.valid();
    }

    public String getResult(String str) {
        return this.f485a.get(str);
    }

    public Set<String> getIdentifiers() {
        return this.f485a.keySet();
    }

    public int getConfidence(String str) {
        return this.f486b.get(str).intValue();
    }

    public boolean hasConfidenceValue(String str) {
        return this.f486b.containsKey(str);
    }

    public boolean isValid() {
        return this.f488d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f488d ? " (valid)\n" : " (invalid)\n");
        for (String next : this.f485a.keySet()) {
            String str = this.f485a.get(next);
            if (str != null) {
                sb.append(next);
                sb.append(" = ");
                sb.append(str.toString());
                sb.append("\n");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
