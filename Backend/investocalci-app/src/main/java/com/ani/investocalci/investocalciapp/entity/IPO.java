package com.ani.investocalci.investocalciapp.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ipos")
public class IPO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 255, nullable = false, unique = true)
    private String company;

    @Column(nullable = false)
    private String type;

    @Column(name = "bid_starts")
    private LocalDate bidStarts;

    @Column(name = "bid_ends")
    private LocalDate bidEnds;

    @Column(name = "listing_date")
    private LocalDate listingDate;

    @Column(name = "listed_on")
    private LocalDate listedOn;

    @Column(name = "price_range_low")
    private int priceRangeLow;

    @Column(name = "price_range_high")
    private int priceRangeHigh;

    @Column(name = "listed_price")
    private int listedPrice;

    @Column(name = "min_investment")
    private int minInvestment;

    @Column(name = "lot_size")
    private int lotSize;

    @Column(name = "issue_size")
    private int issueSize;

    @Column(name = "subs_qib")
    private float subsQib;

    @Column(name = "subs_nii")
    private float subsNii;

    @Column(name = "subs_rii")
    private float subsRii;

    @Column(name = "subs_emp")
    private float subsEmp;

    public IPO() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getBidStarts() {
        return bidStarts;
    }

    public void setBidStarts(LocalDate bidStarts) {
        this.bidStarts = bidStarts;
    }

    public LocalDate getBidEnds() {
        return bidEnds;
    }

    public void setBidEnds(LocalDate bidEnds) {
        this.bidEnds = bidEnds;
    }

    public LocalDate getListingDate() {
        return listingDate;
    }

    public void setListingDate(LocalDate listingDate) {
        this.listingDate = listingDate;
    }

    public LocalDate getListedOn() {
        return listedOn;
    }

    public void setListedOn(LocalDate listedOn) {
        this.listedOn = listedOn;
    }

    public int getPriceRangeLow() {
        return priceRangeLow;
    }

    public void setPriceRangeLow(int priceRangeLow) {
        this.priceRangeLow = priceRangeLow;
    }

    public int getPriceRangeHigh() {
        return priceRangeHigh;
    }

    public void setPriceRangeHigh(int priceRangeHigh) {
        this.priceRangeHigh = priceRangeHigh;
    }

    public int getListedPrice() {
        return listedPrice;
    }

    public void setListedPrice(int listedPrice) {
        this.listedPrice = listedPrice;
    }

    public int getMinInvestment() {
        return minInvestment;
    }

    public void setMinInvestment(int minInvestment) {
        this.minInvestment = minInvestment;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    public int getIssueSize() {
        return issueSize;
    }

    public void setIssueSize(int issueSize) {
        this.issueSize = issueSize;
    }

    public float getSubsQib() {
        return subsQib;
    }

    public void setSubsQib(float subsQib) {
        this.subsQib = subsQib;
    }

    public float getSubsNii() {
        return subsNii;
    }

    public void setSubsNii(float subsNii) {
        this.subsNii = subsNii;
    }

    public float getSubsRii() {
        return subsRii;
    }

    public void setSubsRii(float subsRii) {
        this.subsRii = subsRii;
    }

    public float getSubsEmp() {
        return subsEmp;
    }

    public void setSubsEmp(float subsEmp) {
        this.subsEmp = subsEmp;
    }

    @Override
    public String toString() {
        return "IPO{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", type='" + type + '\'' +
                ", bidStarts=" + bidStarts +
                ", bidEnds=" + bidEnds +
                ", listedOn=" + listedOn +
                ", priceRangeLow=" + priceRangeLow +
                ", priceRangeHigh=" + priceRangeHigh +
                ", listedPrice=" + listedPrice +
                ", minInvestment=" + minInvestment +
                ", lotSize=" + lotSize +
                ", issueSize=" + issueSize +
                ", subsQib=" + subsQib +
                ", subsNii=" + subsNii +
                ", subsRii=" + subsRii +
                ", subsEmp=" + subsEmp +
                '}';
    }
}
