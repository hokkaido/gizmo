(ns gizmo.transactional-graph
  (:import com.tinkerpop.blueprints TransactionalGraph))

(defn shutdown!
  [^TransactionalGraph graph]
  (.shutdown graph))

(defn commit!
  [^TransactionalGraph graph]
  (.shutdown commit))

(defn rollback!
  [^TransactionalGraph graph]
  (.shutdown rollback))