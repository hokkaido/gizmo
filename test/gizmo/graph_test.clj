(ns gizmo.graph-test
  (:require [clojure.test :refer :all]
            [gizmo.graph :as g])
  (:import  (com.tinkerpop.blueprints Element TransactionalGraph TransactionalGraph$Conclusion Features)
            (com.tinkerpop.blueprints.impls.tg TinkerGraphFactory TinkerGraph)))
  
(deftest test-graph-add-a
  (testing "getFeatures()"
    (let [graph (TinkerGraphFactory/createTinkerGraph)
          vertexA (.addVertex graph "OMG")]
    (is (= 7 (count (seq (g/get-vertices graph))))))))


(deftest test-graph-add-b
  (testing "getFeatures()"
    (let [graph (TinkerGraphFactory/createTinkerGraph)
          vertexA (g/add-vertex! graph "OMG")]
    (is (= 7 (count (seq (g/get-vertices graph))))))))