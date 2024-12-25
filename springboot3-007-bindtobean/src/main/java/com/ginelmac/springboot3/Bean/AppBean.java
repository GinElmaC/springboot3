package com.ginelmac.springboot3.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "appbean")
public class AppBean {
    private String[] names;
    private Address[] addresses;
    private List<Address> addrList;
    private Map<String,Address> addrs;

    public AppBean() {
    }

    public AppBean(String[] names, Address[] addresses, List<Address> addrList, Map<String, Address> addrs) {
        this.names = names;
        this.addresses = addresses;
        this.addrList = addrList;
        this.addrs = addrs;
    }

    /**
     * 获取
     * @return names
     */
    public String[] getNames() {
        return names;
    }

    /**
     * 设置
     * @param names
     */
    public void setNames(String[] names) {
        this.names = names;
    }

    /**
     * 获取
     * @return addresses
     */
    public Address[] getAddresses() {
        return addresses;
    }

    /**
     * 设置
     * @param addresses
     */
    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    /**
     * 获取
     * @return addrList
     */
    public List<Address> getAddrList() {
        return addrList;
    }

    /**
     * 设置
     * @param addrList
     */
    public void setAddrList(List<Address> addrList) {
        this.addrList = addrList;
    }

    /**
     * 获取
     * @return addrs
     */
    public Map<String, Address> getAddrs() {
        return addrs;
    }

    /**
     * 设置
     * @param addrs
     */
    public void setAddrs(Map<String, Address> addrs) {
        this.addrs = addrs;
    }

    public String toString() {
        return "AppBean{names = " + names + ", addresses = " + addresses + ", addrList = " + addrList + ", addrs = " + addrs + "}";
    }
}
