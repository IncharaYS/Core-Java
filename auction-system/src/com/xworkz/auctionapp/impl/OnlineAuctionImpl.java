package com.xworkz.auctionapp.impl;

import com.xworkz.auctionapp.auction.Auction;

public class OnlineAuctionImpl implements Auction {
    @Override
    public void startAuction() {
        System.out.println("Starting online auction");
    }

    @Override
    public void placeBid() {
        System.out.println("Placing bid in online auction");
    }

    @Override
    public void closeAuction() {
        System.out.println("Closing online auction");
    }
}
