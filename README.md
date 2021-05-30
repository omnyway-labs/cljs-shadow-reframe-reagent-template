## Template for Clojurescript Reframe / Reagent App

You can use this template this as a starting point for re-frame / reagent
applications

## Available Scripts

In the project directory, you can run:

### `yarn start`

Runs the app in development mode.<br>
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.
The page will reload if you make edits.

The app uses [Reagent](https://reagent-project.github.io), a minimalistic interface between ClojureScript and React.<br>
You can use existing npm React components directly via a [interop call](http://reagent-project.github.io/docs/master/InteropWithReact.html#creating-reagent-components-from-react-components).

It  uses [Re-Frame](http://day8.github.io/re-frame/) for state management

The [re-frame-10x](https://github.com/day8/re-frame-10x) debugging dashboard for re-frame is installed by default for dev.
`Ctl-h` will hide or show the dashboard.

Also included is the Omnyway open source library
[refn](https://github.com/omnyway-labs/refn) that adds some syntactic wrappers
for defining and subscribing re-frame events. It also adds mechanisms for using
the re-frame app-db for caching large resultsets from db accesses.

Builds use [Shadow CLJS](https://github.com/thheller/shadow-cljs) for maximum
compatibility with NPM libraries. You'll need a [Java
SDK](https://adoptopenjdk.net/) (Version 8+, Hotspot) to use it. <br> You can
[import npm
libraries](https://shadow-cljs.github.io/docs/UsersGuide.html#js-deps) using
Shadow CLJS. See the [user
manual](https://shadow-cljs.github.io/docs/UsersGuide.html) for more
information.

### `yarn build`

Builds the app for production to the `dist` folder.<br>
It correctly bundles all code and optimizes the build for the best performance.

Your app is ready to be deployed!

## Other useful scripts

### `yarn lint` and `yarn format`

`yarn lint` checks the code for known bad code patterns using [clj-kondo](https://github.com/borkdude/clj-kondo).

`yarn format` will format your code in a consistent manner using [zprint-clj](https://github.com/clj-commons/zprint-clj).

### `yarn report`

Make a report of what files contribute to your app size.<br>
Consider [code-splitting](https://code.thheller.com/blog/shadow-cljs/2019/03/03/code-splitting-clojurescript.html) or using smaller libraries to make your app load faster.

### `yarn server`

Starts a Shadow CLJS background server.<br>
This will speed up starting time for other commands that use Shadow CLJS.

## License

Released under MIT License

Copyright 2021 Robert Berger and Omnyway Inc.

## Thanks To

Filipe Silva (filipesilva) for [create-cljs-app](https://github.com/filipesilva/create-cljs-app) which this started from
