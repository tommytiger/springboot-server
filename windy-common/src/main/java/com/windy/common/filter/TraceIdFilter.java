package com.windy.common.filter;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class TraceIdFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
