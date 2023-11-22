package com.lianok.docking.complaint.response;

import com.lianok.core.entity.DockingResponseBase;

import java.util.List;

public class ApiHlComplaintDetailQueryResponse extends DockingResponseBase {

    private ApiHlComplaintDetailResponse complaint;

    private List<ApiHlComplaintLogResponse> communicationList;

    public ApiHlComplaintDetailResponse getComplaint() {
        return complaint;
    }

    public void setComplaint(ApiHlComplaintDetailResponse complaint) {
        this.complaint = complaint;
    }

    public List<ApiHlComplaintLogResponse> getCommunicationList() {
        return communicationList;
    }

    public void setCommunicationList(List<ApiHlComplaintLogResponse> communicationList) {
        this.communicationList = communicationList;
    }
}
