package com.pp.pengpa.entity;

import java.io.Serializable;

public class Tusers implements Serializable{
	private Long id;
    private String username;
    private String userpwd;
    private String tradingpwd;
    private Integer userstate;
    private Integer usertype;
    private String registeredtme;
    private String phones;
    private String mechanicals;
    private String weixinid;
    private Integer realnamestate;
    private Integer deposit;
    private Integer recommendid;
    private Integer withdrawalsstate;
    private String haderpath;
    private Integer start;
    private Integer end;
   
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getTradingpwd() {
		return tradingpwd;
	}
	public void setTradingpwd(String tradingpwd) {
		this.tradingpwd = tradingpwd;
	}
	public Integer getUserstate() {
		return userstate;
	}
	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}
	public Integer getUsertype() {
		return usertype;
	}
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}
	public String getRegisteredtme() {
		return registeredtme;
	}
	public void setRegisteredtme(String registeredtme) {
		this.registeredtme = registeredtme;
	}
	public String getPhones() {
		return phones;
	}
	public void setPhones(String phones) {
		this.phones = phones;
	}
	public String getMechanicals() {
		return mechanicals;
	}
	public void setMechanicals(String mechanicals) {
		this.mechanicals = mechanicals;
	}
	public String getWeixinid() {
		return weixinid;
	}
	public void setWeixinid(String weixinid) {
		this.weixinid = weixinid;
	}
	public Integer getRealnamestate() {
		return realnamestate;
	}
	public void setRealnamestate(Integer realnamestate) {
		this.realnamestate = realnamestate;
	}
	public Integer getDeposit() {
		return deposit;
	}
	public void setDeposit(Integer deposit) {
		this.deposit = deposit;
	}
	public Integer getRecommendid() {
		return recommendid;
	}
	public void setRecommendid(Integer recommendid) {
		this.recommendid = recommendid;
	}
	public Integer getWithdrawalsstate() {
		return withdrawalsstate;
	}
	public void setWithdrawalsstate(Integer withdrawalsstate) {
		this.withdrawalsstate = withdrawalsstate;
	}
	public String getHaderpath() {
		return haderpath;
	}
	public void setHaderpath(String haderpath) {
		this.haderpath = haderpath;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
    
    
}
