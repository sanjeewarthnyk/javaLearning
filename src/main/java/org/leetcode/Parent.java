package org.leetcode;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.apache.log4j.net.SyslogAppender;

import java.util.Objects;

public class Parent {
    public String name;
    public String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parent)) return false;
        Parent parent = (Parent) o;
        return name.equals(parent.name) && address.equals(parent.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }



    public static void main(String[] args) {
        Integer val  = 5;
        String val2 = "4";
        int x = val;
        System.out.println(val*Integer.parseInt(val2 ));
    }

}
