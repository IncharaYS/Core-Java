package com.xworkz.auctionapp;

import com.xworkz.auctionapp.auction.Auction;
import com.xworkz.auctionapp.impl.OnlineAuctionImpl;

public class AuctionRunner {
    public static void main(String[] args) {
        Auction auction=new OnlineAuctionImpl();
        auction.startAuction();
        auction.placeBid();
        auction.closeAuction();
    }
}
