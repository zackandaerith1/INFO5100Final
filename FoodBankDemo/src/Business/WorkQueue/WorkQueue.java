/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<FoodbankToFundingWorkRequest> Fundingworkrequestlist;

    public WorkQueue() {
        workRequestList = new ArrayList();
        Fundingworkrequestlist = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<FoodbankToFundingWorkRequest> getFoodbankToFundingworkrequestlist() {
        return Fundingworkrequestlist;
    }
    
    public int numfbwq(){
        int num = 0;
        for (FoodbankToFundingWorkRequest i: Fundingworkrequestlist){
            num++;
        }
        return num;
    }
    
    public int numwq(){
        int n = 0;
        for(WorkRequest i:workRequestList){
            n++;
        }
        return n;
    }
    
    public int getTotalwq(){
        return this.numfbwq()+this.numwq();
    }
}