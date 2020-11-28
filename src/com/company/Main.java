package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FamilyNode familyTreeNode;
        List<FamilyNode> familyTreeArray = new ArrayList<>();
        int parentID = 0;
        int nodeID = 0;
        String line = "";
        String splitBy = ",";

        try
        {
            // Parse CSV file
            BufferedReader br = new BufferedReader(new FileReader("data/data.csv"));

            while ((line = br.readLine()) != null)
            {
                // Use comma as separator
                String[] family = line.split(splitBy);
                //System.out.println(family[0] + " " + family[1] + " " + family[2]);

                // Create a node for each line in CSV file
                familyTreeNode = new FamilyNode("","","");
                familyTreeNode.setParentID(family[0]);
                familyTreeNode.setNodeID(family[1]);
                familyTreeNode.setNodeName(family[2]);

                // Add to family tree array
                familyTreeArray.add(familyTreeNode);

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // Start creating family tree
        if (familyTreeArray.get(0).getParentID() == "")
        {
            System.out.println("Family Tree");
            System.out.println("Node " + familyTreeArray.get(0).getNodeID() + ": " + familyTreeArray.get(0).getNodeName());
            System.out.println();

            // Go through each parent nodes
            for (int i = 1; i < familyTreeArray.size(); i++) {

                System.out.println("Node " + familyTreeArray.get(i).getNodeID() + ": " + familyTreeArray.get(i).getNodeName());

                for (int j = 0; j < familyTreeArray.size(); j++) {

                    // Grab parent ID and compare with each Node ID
                    parentID = Integer.parseInt(familyTreeArray.get(i).getParentID());
                    nodeID = Integer.parseInt(familyTreeArray.get(j).getNodeID());

                    if (parentID == nodeID)
                    {
                        System.out.println("Parent/Root is Node " + parentID);
                        System.out.println();
                    }


                    //System.out.println(familyTreeArray.get(j).getParentID() + " " + familyTreeArray.get(j).getNodeID() + " " + familyTreeArray.get(j).getNodeName());


                }

            }
        }





    } // End of Main function
} // End of Main class
