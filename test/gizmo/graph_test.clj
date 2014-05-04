(ns gizmo.graph-test
  (:require [clojure.test :refer :all]
            [gizmo.graph :as g]
            [gizmo.vertex :as v])
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

(deftest test-add-and-get
  (testing "add-get-equality"
    (let [graph (TinkerGraphFactory/createTinkerGraph)
          a     (g/add-vertex! graph "bz")
          b     (g/get-vertex graph "bz")]
    (is (= (v/get-id a) (v/get-id b))))))