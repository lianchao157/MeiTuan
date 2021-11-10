package com.meituan.demo.domain.model;

import java.util.Date;

public class HbVehicleInout {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.orgid
     *
     * @mbg.generated
     */
    private String orgid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.orgname
     *
     * @mbg.generated
     */
    private String orgname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.vehicleid
     *
     * @mbg.generated
     */
    private String vehicleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.intime
     *
     * @mbg.generated
     */
    private Date intime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.outtime
     *
     * @mbg.generated
     */
    private Date outtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.equipid
     *
     * @mbg.generated
     */
    private String equipid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.reserved1
     *
     * @mbg.generated
     */
    private String reserved1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.reserved2
     *
     * @mbg.generated
     */
    private String reserved2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.reserved3
     *
     * @mbg.generated
     */
    private String reserved3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.reserved4
     *
     * @mbg.generated
     */
    private String reserved4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hb_vehicle_inout.reserved5
     *
     * @mbg.generated
     */
    private String reserved5;

    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.id
     *
     * @return the value of hb_vehicle_inout.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.id
     *
     * @param id the value for hb_vehicle_inout.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.orgid
     *
     * @return the value of hb_vehicle_inout.orgid
     *
     * @mbg.generated
     */
    public String getOrgid() {
        return orgid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.orgid
     *
     * @param orgid the value for hb_vehicle_inout.orgid
     *
     * @mbg.generated
     */
    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.orgname
     *
     * @return the value of hb_vehicle_inout.orgname
     *
     * @mbg.generated
     */
    public String getOrgname() {
        return orgname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.orgname
     *
     * @param orgname the value for hb_vehicle_inout.orgname
     *
     * @mbg.generated
     */
    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.vehicleid
     *
     * @return the value of hb_vehicle_inout.vehicleid
     *
     * @mbg.generated
     */
    public String getVehicleid() {
        return vehicleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.vehicleid
     *
     * @param vehicleid the value for hb_vehicle_inout.vehicleid
     *
     * @mbg.generated
     */
    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid == null ? null : vehicleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.intime
     *
     * @return the value of hb_vehicle_inout.intime
     *
     * @mbg.generated
     */
    public Date getIntime() {
        return intime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.intime
     *
     * @param intime the value for hb_vehicle_inout.intime
     *
     * @mbg.generated
     */
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.outtime
     *
     * @return the value of hb_vehicle_inout.outtime
     *
     * @mbg.generated
     */
    public Date getOuttime() {
        return outtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.outtime
     *
     * @param outtime the value for hb_vehicle_inout.outtime
     *
     * @mbg.generated
     */
    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.equipid
     *
     * @return the value of hb_vehicle_inout.equipid
     *
     * @mbg.generated
     */
    public String getEquipid() {
        return equipid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.equipid
     *
     * @param equipid the value for hb_vehicle_inout.equipid
     *
     * @mbg.generated
     */
    public void setEquipid(String equipid) {
        this.equipid = equipid == null ? null : equipid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.reserved1
     *
     * @return the value of hb_vehicle_inout.reserved1
     *
     * @mbg.generated
     */
    public String getReserved1() {
        return reserved1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.reserved1
     *
     * @param reserved1 the value for hb_vehicle_inout.reserved1
     *
     * @mbg.generated
     */
    public void setReserved1(String reserved1) {
        this.reserved1 = reserved1 == null ? null : reserved1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.reserved2
     *
     * @return the value of hb_vehicle_inout.reserved2
     *
     * @mbg.generated
     */
    public String getReserved2() {
        return reserved2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.reserved2
     *
     * @param reserved2 the value for hb_vehicle_inout.reserved2
     *
     * @mbg.generated
     */
    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.reserved3
     *
     * @return the value of hb_vehicle_inout.reserved3
     *
     * @mbg.generated
     */
    public String getReserved3() {
        return reserved3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.reserved3
     *
     * @param reserved3 the value for hb_vehicle_inout.reserved3
     *
     * @mbg.generated
     */
    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.reserved4
     *
     * @return the value of hb_vehicle_inout.reserved4
     *
     * @mbg.generated
     */
    public String getReserved4() {
        return reserved4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.reserved4
     *
     * @param reserved4 the value for hb_vehicle_inout.reserved4
     *
     * @mbg.generated
     */
    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4 == null ? null : reserved4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hb_vehicle_inout.reserved5
     *
     * @return the value of hb_vehicle_inout.reserved5
     *
     * @mbg.generated
     */
    public String getReserved5() {
        return reserved5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hb_vehicle_inout.reserved5
     *
     * @param reserved5 the value for hb_vehicle_inout.reserved5
     *
     * @mbg.generated
     */
    public void setReserved5(String reserved5) {
        this.reserved5 = reserved5 == null ? null : reserved5.trim();
    }
}