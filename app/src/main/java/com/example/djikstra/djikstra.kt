package com.example.djikstra

import java.util.*
import java.util.stream.Collectors
import java.util.stream.Stream

class djikstra {
    fun calculatedShortestPath(source: node) {
        source
        val settledNodes: MutableSet<Node> = HashSet()
        val unsettledNodes: Queue<Node> = PriorityQueue(setOf(source))
        while (!unsettledNodes.isEmpty()) {
            val currentNode = unsettledNodes.poll()
            currentNode.getAdjacentNodes()
                .entrySet().stream()
                .filter { entry -> !settledNodes.contains(entry.getKey()) }
                .forEach { entry ->
                    evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode)
                    unsettledNodes.add(entry.getKey())
                }
            settledNodes.add(currentNode)
        }
    }

    private fun evaluateDistanceAndPath(adjacentNode: Node, edgeWeight: Int, sourceNode: Node) {
        val newDistance: Int = sourceNode.getDistance()+ edgeWeight
        if (newDistance < adjacentNode.getDistance()) {
            adjacentNode.setDistance(newDistance)
            adjacentNode.setShortestPath(
                Stream.concat(sourceNode.getShortestPath().stream(), Stream.of(sourceNode)).collect(
                    Collectors.toList()
                )
            )
        }
    }
}