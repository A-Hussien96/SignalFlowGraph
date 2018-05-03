package Structure;

import java.util.ArrayList;

public interface IPath {

    INode getStart();
    INode getEnd ();
    ArrayList getEdges ();
    void addNode(INode node);
    void removeNodeAt(int nodeIndex);
    void setEnd(INode end);
    void setStart(INode start);
    void setNodes(ArrayList<INode> nodes);


}
