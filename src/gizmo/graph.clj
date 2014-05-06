(ns gizmo.graph
  (:refer-clojure :exclude [keys])
  (:import (com.tinkerpop.blueprints Graph Vertex Edge)))

(defn get-features
  [^Graph graph]
  (.getFeatures graph))

(defn add-vertex!
  [^Graph graph id]
  (.addVertex graph id))

(defn get-vertex
  [^Graph graph id]
  (.getVertex graph id))

(defn remove-vertex! 
  [^Graph graph ^Vertex vertex]
  (.removeVertex graph vertex))

(defn get-vertices
  "Returns an iterable to all the vertices in the graph. If this is not possible 
  for the implementation, then an UnsupportedOperationException can be thrown."
  ([^Graph graph] 
    (.getVertices graph))
  ([^Graph graph key value]
    (.getVertices graph key value)))

(defn add-edge!
  [^Graph graph id ^Vertex outVertex ^Vertex inVertex label]
  (.addEdge graph id outVertex inVertex label))

(defn get-edge
  [^Graph graph id]
  (.getEdge graph id))

(defn remove-edge!
  [^Graph graph ^Edge edge]
  (.removeEdge graph edge))

(defn get-edges
  ([^Graph graph]
    (.getEdges graph))
  ([^Graph graph key value]
    (.getEdges graph key value)))

(defn query
  [^Graph graph]
  (.query graph))

(defn shutdown!
  [^Graph graph]
  (.shutdown graph))