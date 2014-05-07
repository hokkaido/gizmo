(ns gizmo.graph
  (:refer-clojure :exclude [keys])
  (:import (com.tinkerpop.blueprints Graph TransactionalGraph ThreadedTransactionalGraph Vertex Edge)))

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

;; TransactionalGraph

;;(defn shutdown!
;;  [^TransactionalGraph graph]
;;  (.shutdown graph))

(defn commit!
  [^TransactionalGraph graph]
  (.shutdown commit))

(defn rollback!
  [^TransactionalGraph graph]
  (.shutdown rollback))

;; ThreadedTransactionalGraph

(defn new-transaction!
  [^ThreadedTransactionalGraph graph]
  (.newTransaction graph)))

;; IndexableGraph

(defn create-index!
  [^IndexableGraph graph indexName indexClass params]
  (.createIndex graph indexName indexClass (into-array String params)))

(defn get-index
  [^IndexableGraph graph indexName indexClass]
  (.getIndex graph indexName indexClass))

(defn get-indices
  [^IndexableGraph graph]
  (.getIndices graph))

(defn drop-index!
  [^IndexableGraph graph]
  (.dropIndex graph))

;; KeyIndexableGraph

(defn drop-key-index!
  [^KeyIndexableGraph graph key elementClass]
  (.dropKeyIndex graph key elementClass))

(defn create-key-index!
  [^KeyIndexableGraph graph key elementClass indexParameters]
  (.createKeyIndex graph key elementClass (into-array ^Parameter indexParameters)))

(defn get-indexed-keys
  [^KeyIndexableGraph graph elementClass]
  (.getIndexedKeys graph elementClass))

;; MetaGraph

(defn get-raw-graph
  [^MetaGraph graph]
  (.getRawGraph graph))