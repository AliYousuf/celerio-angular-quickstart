/*
 * Project home: https://github.com/jaxio/celerio-angular-quickstart
 * 
 * Source code generated by Celerio, an Open Source code generator by Jaxio.
 * Documentation: http://www.jaxio.com/documentation/celerio/
 * Source code: https://github.com/jaxio/celerio/
 * Follow us on twitter: @jaxiosoft
 * This header can be customized in Celerio conf...
 * Template pack-angular:src/main/java/dto/support/LazyLoadEvent.java.p.vm
 */
package com.mycompany.myapp.dto.support;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class LazyLoadEvent {
    /**
     * First row offset.
     */
    public int first;

    /**
     * Number of rows per page.
     */
    public int rows;

    public String sortField;
    public int sortOrder;

    public Pageable toPageable() {
        if (sortField != null) {
            return new PageRequest(toPageIndex(), rows, toSortDirection(), sortField);
        } else {
            return new PageRequest(toPageIndex(), rows);
        }
    }

    /**
     * Zero based page index.
     */
    public int toPageIndex() {
        return (first + rows) / rows - 1;
    }

    public Sort.Direction toSortDirection() {
        return sortOrder == 1 ? Sort.Direction.ASC : Sort.Direction.DESC;
    }
}