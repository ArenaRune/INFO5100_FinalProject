/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import java.util.ArrayList;
import model.movie.Movie;
import model.person.Person;
import model.workrequest.RefundWorkRequest;

/**
 *
 * @author arenarune
 */
public class CustomerSupportRole extends Role {
    private static ArrayList<RefundWorkRequest> refundWorkQueue = new ArrayList<RefundWorkRequest>();
    
    public CustomerSupportRole(Person person) {
        super(person);
    }
    
    public static RefundWorkRequest newRefundWorkRequest(){
        RefundWorkRequest rwr = new RefundWorkRequest();
        refundWorkQueue.add(rwr);
        return rwr;
    }

    public static ArrayList<RefundWorkRequest> getRefundWorkQueue() {
        return refundWorkQueue;
    }
    
    @Override
    public String toString() {
        return this.person.getName();
    }
}
