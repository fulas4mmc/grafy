package com.example.djikstra

import lombok.Getter
import lombok.RequiredArgsConstructor
import lombok.Setter
import org.w3c.dom.Node
import java.util.*


@RequiredArgsConstructor
abstract class node {

    abstract var name: String
    private var distance: Int = Int.MAX_VALUE
    get() = distance
   // private var shortestPath:

    private var adjacentNodes = HashMap<node, Int>()

    fun  addAdjacentNode(node: node,weight:Int){
        adjacentNodes.put(node,weight)
    }
    fun deleteAdjacentNode(node: node,weight: Int){
        adjacentNodes.remove(node,weight)
    }
    @Override
    open fun compareTo(node: node): Int {
        return Integer.compare(distance, node.distance)
    }


}