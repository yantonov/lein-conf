{:user {:dependencies [[alembic "0.3.2"]
                       [pjstadig/humane-test-output "0.7.1"]
                       [org.clojure/tools.nrepl "0.2.12"]]
        :plugins [[cider/cider-nrepl "0.10.0"]
                  [lein-cljfmt "0.3.0"]
                  [lein-kibit "0.1.2"]
                  [refactor-nrepl "1.2.0"]
                  [lein-ancient "0.6.8"]
                  [jonase/eastwood "0.2.2"]
                  ;[venantius/ultra "0.4.0"]
                  ]
        :ultra {:color-scheme :solarized_dark}
        :injections [(use 'clojure.repl)
                     (use 'clojure.java.javadoc)
                     (require 'alembic.still)
                     (require 'pjstadig.humane-test-output)
                     (pjstadig.humane-test-output/activate!)]}}
