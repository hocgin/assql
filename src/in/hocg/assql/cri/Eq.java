package in.hocg.assql.cri;

import java.util.ArrayList;

/**
 * Created by hocgin on 16-4-26.
 */
public class Eq extends AbstractSqlExpression {

    private Object value;

    protected Eq(String name, Object value) {
        super(name);
        this.value = value;
        this.not = false;
    }

    @Override
    public void joinSql(StringBuilder sb) {
        sb.append(getName()).append(' ').append(not?"!":"").append("=").append(' ').append('?');
    }


    @Override
    public void joinParam(ArrayList<Object> params) {
        params.add(value);
    }
}
