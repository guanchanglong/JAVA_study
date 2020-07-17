package com.domain;

import java.io.Serializable;
import java.util.List;

public class QueryProduct implements Serializable {
    private List<String> p_type;

    public List<String> getP_type() {
        return p_type;
    }

    public void setP_type(List<String> p_type) {
        this.p_type = p_type;
    }
}
