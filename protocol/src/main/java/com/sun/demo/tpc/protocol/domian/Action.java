package com.sun.demo.tpc.protocol.domian;

import java.io.Serializable;
import java.util.List;

public interface Action extends Serializable {
    String action();

    List<Object> params();
}
