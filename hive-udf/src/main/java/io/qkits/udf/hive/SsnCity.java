package io.qkits.udf.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

import io.qkits.udf.hive.utils.SsnTool;

public class SsnCity extends UDF {

    public String evaluate(String ssn) {
        if (ssn == null) {
            return null;
        }
        return SsnTool.getCity(SsnTool.cleanSsn(ssn));
    }
}
