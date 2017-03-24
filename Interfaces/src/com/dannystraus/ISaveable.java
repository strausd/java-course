package com.dannystraus;

import java.util.List;

/**
 * Created by strausd on 3/24/2017.
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
