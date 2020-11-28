package com.company;

public class FamilyNode {
    private String parentID;
    private String nodeID;
    private String nodeName;

    public FamilyNode(String parentID, String nodeID, String nodeName) {
        this.parentID = parentID;
        this.nodeID = nodeID;
        this.nodeName = nodeName;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
}
