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

    public ArrayList<FoodbankToFundingWorkRequest> getFundingworkrequestlist() {
        return Fundingworkrequestlist;
    }
    
}