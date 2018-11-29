package com.mieasy.retrofit2studydemo.module;


public class ReportListBean {
    /**
     * vrId : 12
     * viId : 1
     * viModel : TC4132
     * reporter : 李志成
     * reportDate : 1540483200000
     * startTime : 11400000
     * endTime : 15000000
     * reportPic : [799a166ae5bfd73.jpg]
     * reportContent :
     * reportI : 26/10/2018 11:10
     * reportX :
     */

    private int vrId;
    private int viId;
    private String viModel;
    private String reporter;
    private long reportDate;
    private int startTime;
    private int endTime;
    private String reportPic;
    private String reportContent;
    private String reportI;
    private String reportX;

    public int getVrId() {
        return vrId;
    }

    public void setVrId(int vrId) {
        this.vrId = vrId;
    }

    public int getViId() {
        return viId;
    }

    public void setViId(int viId) {
        this.viId = viId;
    }

    public String getViModel() {
        return viModel;
    }

    public void setViModel(String viModel) {
        this.viModel = viModel;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public long getReportDate() {
        return reportDate;
    }

    public void setReportDate(long reportDate) {
        this.reportDate = reportDate;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getReportPic() {
        return reportPic;
    }

    public void setReportPic(String reportPic) {
        this.reportPic = reportPic;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportI() {
        return reportI;
    }

    public void setReportI(String reportI) {
        this.reportI = reportI;
    }

    public String getReportX() {
        return reportX;
    }

    public void setReportX(String reportX) {
        this.reportX = reportX;
    }
//    /**
//     * ip : 21.22.11.33
//     * country : 美国
//     * area :
//     * region : 纽约
//     * city : 纽约
//     * county : XX
//     * isp : XX
//     * country_id : US
//     * area_id :
//     * region_id : US_132
//     * city_id : US_1084
//     * county_id : xx
//     * isp_id : xx
//     */
//
//    private String ip;
//    private String country;
//    private String area;
//    private String region;
//    private String city;
//    private String county;
//    private String isp;
//    private String country_id;
//    private String area_id;
//    private String region_id;
//    private String city_id;
//    private String county_id;
//    private String isp_id;
//
//    public String getIp() {
//        return ip;
//    }
//
//    public void setIp(String ip) {
//        this.ip = ip;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getArea() {
//        return area;
//    }
//
//    public void setArea(String area) {
//        this.area = area;
//    }
//
//    public String getRegion() {
//        return region;
//    }
//
//    public void setRegion(String region) {
//        this.region = region;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getCounty() {
//        return county;
//    }
//
//    public void setCounty(String county) {
//        this.county = county;
//    }
//
//    public String getIsp() {
//        return isp;
//    }
//
//    public void setIsp(String isp) {
//        this.isp = isp;
//    }
//
//    public String getCountry_id() {
//        return country_id;
//    }
//
//    public void setCountry_id(String country_id) {
//        this.country_id = country_id;
//    }
//
//    public String getArea_id() {
//        return area_id;
//    }
//
//    public void setArea_id(String area_id) {
//        this.area_id = area_id;
//    }
//
//    public String getRegion_id() {
//        return region_id;
//    }
//
//    public void setRegion_id(String region_id) {
//        this.region_id = region_id;
//    }
//
//    public String getCity_id() {
//        return city_id;
//    }
//
//    public void setCity_id(String city_id) {
//        this.city_id = city_id;
//    }
//
//    public String getCounty_id() {
//        return county_id;
//    }
//
//    public void setCounty_id(String county_id) {
//        this.county_id = county_id;
//    }
//
//    public String getIsp_id() {
//        return isp_id;
//    }
//
//    public void setIsp_id(String isp_id) {
//        this.isp_id = isp_id;
//    }
//    private int carId;
//    private int pNumber;
//    private String autoPay;
//
//    public int getCarId() {
//        return carId;
//    }
//
//    public void setCarId(int carId) {
//        this.carId = carId;
//    }
//
//    public int getPnumber() {
//        return pNumber;
//    }
//
//    public void setPnumber(int pnumber) {
//        this.pNumber = pnumber;
//    }
//
//    public String getAutoPay() {
//        return autoPay;
//    }
//
//    public void setAutoPay(String autoPay) {
//        this.autoPay = autoPay;
//    }
//
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(this.carId);
//        dest.writeInt(this.pNumber);
//        dest.writeString(this.autoPay);
//    }
//
//    public JavaBean() {
//    }
//
//    protected JavaBean(Parcel in) {
//        this.carId = in.readInt();
//        this.pNumber = in.readInt();
//        this.autoPay = in.readString();
//    }
//
//    public static final Parcelable.Creator<JavaBean> CREATOR = new Parcelable.Creator<JavaBean>() {
//        @Override
//        public JavaBean createFromParcel(Parcel source) {
//            return new JavaBean(source);
//        }
//
//        @Override
//        public JavaBean[] newArray(int size) {
//            return new JavaBean[size];
//        }
//    };

}
