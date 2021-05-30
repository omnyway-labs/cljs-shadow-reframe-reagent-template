(ns app.events
  (:require
   [re-frame.core :as rf
    :refer [reg-event-db reg-event-fx]]
   [refn.core :refer [>> << defx
                      assoc-db]]))

(reg-event-db :rf-count (assoc-db :rf-count))

