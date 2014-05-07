(ns gizmo.query-test
  (:require [clojure.test :refer :all]
            [gizmo.graph :as g]
            [gizmo.vertex :as v]
            [gizmo.edge :as e]
            [gizmo.query :as q])
  (:import  (com.tinkerpop.blueprints.impls.tg TinkerGraphFactory TinkerGraph)))
  
(deftest test-query
  (testing "vertex query"
    (let [graph (TinkerGraphFactory/createTinkerGraph)
          bonnie (g/add-vertex! graph nil)
          clyde (g/add-vertex! graph nil)
          police (g/add-vertex! graph nil)
          likes (g/add-edge! graph nil bonnie clyde "likes")
          query-result (q/labels (v/query bonnie) ["likes"])]
    (is (= likes (first (q/edges query-result)))))))


