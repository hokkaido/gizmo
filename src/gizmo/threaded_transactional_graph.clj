(ns gizmo.threaded-transactional-graph
  (:import (com.tinkerpop.blueprints ThreadedTransactionalGraph)))

(defn new-transaction!
  [^ThreadedTransactionalGraph graph]
  (.newTransaction graph)))