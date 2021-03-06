package planet9.frontend.type;

import java.util.List;

public class IntersectionType implements MultiType {
    private List<Type> types;

    public IntersectionType(List<Type> types) {
        this.types = types;
    }

    @Override
    public List<Type> types() {
        return this.types;
    }

    @Override
    public boolean isAssignableTo(Type other) {
        for (Type x : this.types) {
            if (x.isAssignableTo(other)) {
                return true;
            }
        }
        return false;
    }

}
