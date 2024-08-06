package com.linkedin.javacodechallenges;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;
import java.util.PriorityQueue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StoreItem {
  String name;
  double retailPrice;
  double discount;

  protected String getName() {
    return name;
  }

  protected double getRetailPrice() {
    return retailPrice;
  }

  protected double getDiscount() {
    return discount;
  }

  protected void setName(String newName){
    this.name = newName;
  }

  protected void setRetailPrice(double newPrice) {
    this.retailPrice = newPrice;
  }

  protected void setDiscount(double newDiscount) {
    this.discount = newDiscount;
  }
  
  public static Optional<StoreItem> findLeastExpensive(Collection<StoreItem> items) {
    /* 
      each store item has a nmae, price, and discount
      model the store item objefts in java
      create an algorithm to calculate the least expensive
        item in a collection
    */
      PriorityQueue <StoreItem> pq = new PriorityQueue<>( (itemOne, itemTwo) -> Double.compare(
       itemOne.getRetailPrice()-(itemOne.getRetailPrice() *  itemOne.getDiscount()), itemTwo.getRetailPrice()-(itemTwo.getRetailPrice() * itemTwo.getDiscount())) );    
      
      Iterator<StoreItem> itt = items.iterator(); 
      while(itt.hasNext()){
        pq.add(itt.next());
      }

    return ((pq.peek() == null) ?  Optional.empty() : Optional.of(pq.poll()) );
  }

  @Override
  public String toString() {
    return "Name: " + name + ", " + "Retail price: " + retailPrice + ", " + "Discount " + discount;
  }
}