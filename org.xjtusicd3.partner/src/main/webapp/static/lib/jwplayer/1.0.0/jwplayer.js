if (typeof jwplayer === "undefined") {
    jwplayer = function() {
        if (jwplayer.api) {
            return jwplayer.api.selectPlayer.apply(this, arguments)
        }
    };
    jwplayer.version = "6.12.0";
    jwplayer.vid = document.createElement("video");
    jwplayer.audio = document.createElement("audio");
    jwplayer.source = document.createElement("source"); (function() {
        var m = this;
        var b = {};
        var g = Array.prototype,
        s = Object.prototype,
        u = Function.prototype;
        var l = g.slice,
        e = g.concat,
        o = s.toString,
        j = s.hasOwnProperty;
        var f = g.map,
        i = g.forEach,
        h = g.filter,
        a = g.every,
        q = g.some,
        n = g.indexOf,
        c = Array.isArray,
        r = Object.keys;
        var t = function(v) {
            if (v instanceof t) {
                return v
            }
            if (! (this instanceof t)) {
                return new t(v)
            }
        };
        var d = t.each = t.forEach = function(A, x, w) {
            if (A == null) {
                return A
            }
            if (i && A.forEach === i) {
                A.forEach(x, w)
            } else {
                if (A.length === +A.length) {
                    for (var v = 0,
                    z = A.length; v < z; v++) {
                        if (x.call(w, A[v], v, A) === b) {
                            return
                        }
                    }
                } else {
                    var y = t.keys(A);
                    for (var v = 0,
                    z = y.length; v < z; v++) {
                        if (x.call(w, A[y[v]], y[v], A) === b) {
                            return
                        }
                    }
                }
            }
            return A
        };
        t.map = t.collect = function(y, x, w) {
            var v = [];
            if (y == null) {
                return v
            }
            if (f && y.map === f) {
                return y.map(x, w)
            }
            d(y,
            function(B, z, A) {
                v.push(x.call(w, B, z, A))
            });
            return v
        };
        t.find = t.detect = function(y, w, x) {
            var v;
            k(y,
            function(B, z, A) {
                if (w.call(x, B, z, A)) {
                    v = B;
                    return true
                }
            });
            return v
        };
        t.filter = t.select = function(y, v, x) {
            var w = [];
            if (y == null) {
                return w
            }
            if (h && y.filter === h) {
                return y.filter(v, x)
            }
            d(y,
            function(B, z, A) {
                if (v.call(x, B, z, A)) {
                    w.push(B)
                }
            });
            return w
        };
        t.every = t.all = function(y, w, x) {
            w || (w = t.identity);
            var v = true;
            if (y == null) {
                return v
            }
            if (a && y.every === a) {
                return y.every(w, x)
            }
            d(y,
            function(B, z, A) {
                if (! (v = v && w.call(x, B, z, A))) {
                    return b
                }
            });
            return !! v
        };
        var k = t.some = t.any = function(y, w, x) {
            w || (w = t.identity);
            var v = false;
            if (y == null) {
                return v
            }
            if (q && y.some === q) {
                return y.some(w, x)
            }
            d(y,
            function(B, z, A) {
                if (v || (v = w.call(x, B, z, A))) {
                    return b
                }
            });
            return !! v
        };
        t.size = function(v) {
            if (v == null) {
                return 0
            }
            return v.length === +v.length ? v.length: t.keys(v).length
        };
        t.after = function(w, v) {
            return function() {
                if (--w < 1) {
                    return v.apply(this, arguments)
                }
            }
        };
        var p = function(v) {
            if (v == null) {
                return t.identity
            }
            if (t.isFunction(v)) {
                return v
            }
            return t.property(v)
        };
        t.sortedIndex = function(C, B, y, x) {
            y = p(y);
            var A = y.call(x, B);
            var v = 0,
            z = C.length;
            while (v < z) {
                var w = (v + z) >>> 1;
                y.call(x, C[w]) < A ? v = w + 1 : z = w
            }
            return v
        };
        t.find = t.detect = function(y, w, x) {
            var v;
            k(y,
            function(B, z, A) {
                if (w.call(x, B, z, A)) {
                    v = B;
                    return true
                }
            });
            return v
        };
        var k = t.some = t.any = function(y, w, x) {
            w || (w = t.identity);
            var v = false;
            if (y == null) {
                return v
            }
            if (q && y.some === q) {
                return y.some(w, x)
            }
            d(y,
            function(B, z, A) {
                if (v || (v = w.call(x, B, z, A))) {
                    return b
                }
            });
            return !! v
        };
        t.contains = t.include = function(w, v) {
            if (w == null) {
                return false
            }
            if (w.length !== +w.length) {
                w = t.values(w)
            }
            return t.indexOf(w, v) >= 0
        };
        t.where = function(w, v) {
            return t.filter(w, t.matches(v))
        };
        t.difference = function(w) {
            var v = e.apply(g, l.call(arguments, 1));
            return t.filter(w,
            function(x) {
                return ! t.contains(v, x)
            })
        };
        t.without = function(v) {
            return t.difference(v, l.call(arguments, 1))
        };
        t.indexOf = function(z, x, y) {
            if (z == null) {
                return - 1
            }
            var v = 0,
            w = z.length;
            if (y) {
                if (typeof y == "number") {
                    v = (y < 0 ? Math.max(0, w + y) : y)
                } else {
                    v = t.sortedIndex(z, x);
                    return z[v] === x ? v: -1
                }
            }
            if (n && z.indexOf === n) {
                return z.indexOf(x, y)
            }
            for (; v < w; v++) {
                if (z[v] === x) {
                    return v
                }
            }
            return - 1
        };
        t.partial = function(v) {
            var w = l.call(arguments, 1);
            return function() {
                var x = 0;
                var y = w.slice();
                for (var z = 0,
                A = y.length; z < A; z++) {
                    if (y[z] === t) {
                        y[z] = arguments[x++]
                    }
                }
                while (x < arguments.length) {
                    y.push(arguments[x++])
                }
                return v.apply(this, y)
            }
        };
        t.memoize = function(x, w) {
            var v = {};
            w || (w = t.identity);
            return function() {
                var y = w.apply(this, arguments);
                return t.has(v, y) ? v[y] : (v[y] = x.apply(this, arguments))
            }
        };
        t.delay = function(w, x) {
            var v = l.call(arguments, 2);
            return setTimeout(function() {
                return w.apply(null, v)
            },
            x)
        };
        t.defer = function(v) {
            return t.delay.apply(t, [v, 1].concat(l.call(arguments, 1)))
        };
        t.keys = function(x) {
            if (!t.isObject(x)) {
                return []
            }
            if (r) {
                return r(x)
            }
            var w = [];
            for (var v in x) {
                if (t.has(x, v)) {
                    w.push(v)
                }
            }
            return w
        };
        t.pick = function(w) {
            var x = {};
            var v = e.apply(g, l.call(arguments, 1));
            d(v,
            function(y) {
                if (y in w) {
                    x[y] = w[y]
                }
            });
            return x
        };
        t.isArray = c ||
        function(v) {
            return o.call(v) == "[object Array]"
        };
        t.isObject = function(v) {
            return v === Object(v)
        };
        d(["Arguments", "Function", "String", "Number", "Date", "RegExp"],
        function(v) {
            t["is" + v] = function(w) {
                return o.call(w) == "[object " + v + "]"
            }
        });
        if (!t.isArguments(arguments)) {
            t.isArguments = function(v) {
                return !! (v && t.has(v, "callee"))
            }
        }
        if (typeof(/./) !== "function") {
            t.isFunction = function(v) {
                return typeof v === "function"
            }
        }
        t.isFinite = function(v) {
            return isFinite(v) && !isNaN(parseFloat(v))
        };
        t.isNaN = function(v) {
            return t.isNumber(v) && v != +v
        };
        t.isBoolean = function(v) {
            return v === true || v === false || o.call(v) == "[object Boolean]"
        };
        t.isNull = function(v) {
            return v === null
        };
        t.isUndefined = function(v) {
            return v === void 0
        };
        t.has = function(w, v) {
            return j.call(w, v)
        };
        t.identity = function(v) {
            return v
        };
        t.constant = function(v) {
            return function() {
                return v
            }
        };
        t.property = function(v) {
            return function(w) {
                return w[v]
            }
        };
        t.matches = function(v) {
            return function(x) {
                if (x === v) {
                    return true
                }
                for (var w in v) {
                    if (v[w] !== x[w]) {
                        return false
                    }
                }
                return true
            }
        };
        t.result = function(v, x) {
            if (v == null) {
                return void 0
            }
            var w = v[x];
            return t.isFunction(w) ? w.call(v) : w
        };
        m._ = t
    }).call(jwplayer); (function(c) {
        var h = c.utils = {};
        var i = c._;
        h.exists = function(m) {
            switch (typeof(m)) {
            case "string":
                return (m.length > 0);
            case "object":
                return (m !== null);
            case "undefined":
                return false
            }
            return true
        };
        h.styleDimension = function(m) {
            return m + (m.toString().indexOf("%") > 0 ? "": "px")
        };
        h.getAbsolutePath = function(s, r) {
            if (!h.exists(r)) {
                r = document.location.href
            }
            if (!h.exists(s)) {
                return
            }
            if (a(s)) {
                return s
            }
            var t = r.substring(0, r.indexOf("://") + 3);
            var q = r.substring(t.length, r.indexOf("/", t.length + 1));
            var n;
            if (s.indexOf("/") === 0) {
                n = s.split("/")
            } else {
                var o = r.split("?")[0];
                o = o.substring(t.length + q.length + 1, o.lastIndexOf("/"));
                n = o.split("/").concat(s.split("/"))
            }
            var m = [];
            for (var p = 0; p < n.length; p++) {
                if (!n[p] || !h.exists(n[p]) || n[p] === ".") {
                    continue
                } else {
                    if (n[p] === "..") {
                        m.pop()
                    } else {
                        m.push(n[p])
                    }
                }
            }
            return t + q + "/" + m.join("/")
        };
        function a(n) {
            if (!h.exists(n)) {
                return
            }
            var o = n.indexOf("://");
            var m = n.indexOf("?");
            return (o > 0 && (m < 0 || (m > o)))
        }
        h.extend = function() {
            var n = Array.prototype.slice.call(arguments, 0);
            if (n.length > 1) {
                var p = n[0],
                m = function(r, q) {
                    if (q !== undefined && q !== null) {
                        p[r] = q
                    }
                };
                for (var o = 1; o < n.length; o++) {
                    h.foreach(n[o], m)
                }
                return p
            }
            return null
        };
        var d = window.console = window.console || {
            log: function() {}
        };
        h.log = function() {
            var m = Array.prototype.slice.call(arguments, 0);
            if (typeof d.log === "object") {
                d.log(m)
            } else {}
        };
        var e = i.memoize(function(n) {
            var m = navigator.userAgent.toLowerCase();
            return (m.match(n) !== null)
        });
        function l(m) {
            return function() {
                return e(m)
            }
        }
        h.isFF = l(/firefox/i);
        h.isChrome = l(/chrome/i);
        h.isIPod = l(/iP(hone|od)/i);
        h.isIPad = l(/iPad/i);
        h.isSafari602 = l(/Macintosh.*Mac OS X 10_8.*6\.0\.\d* Safari/i);
        h.isIETrident = function(m) {
            if (m) {
                m = parseFloat(m).toFixed(1);
                return e(new RegExp("trident/.+rv:\\s*" + m, "i"))
            }
            return e(/trident/i)
        };
        h.isMSIE = function(m) {
            if (m) {
                m = parseFloat(m).toFixed(1);
                return e(new RegExp("msie\\s*" + m, "i"))
            }
            return e(/msie/i)
        };
        h.isIE = function(m) {
            if (m) {
                m = parseFloat(m).toFixed(1);
                if (m >= 11) {
                    return h.isIETrident(m)
                } else {
                    return h.isMSIE(m)
                }
            }
            return h.isMSIE() || h.isIETrident()
        };
        h.isSafari = function() {
            return (e(/safari/i) && !e(/chrome/i) && !e(/chromium/i) && !e(/android/i))
        };
        h.isIOS = function(m) {
            if (m) {
                return e(new RegExp("iP(hone|ad|od).+\\sOS\\s" + m, "i"))
            }
            return e(/iP(hone|ad|od)/i)
        };
        h.isAndroidNative = function(m) {
            return h.isAndroid(m, true)
        };
        h.isAndroid = function(m, n) {
            if (n && e(/chrome\/[123456789]/i) && !e(/chrome\/18/)) {
                return false
            }
            if (m) {
                if (h.isInt(m) && !/\./.test(m)) {
                    m = "" + m + "."
                }
                return e(new RegExp("Android\\s*" + m, "i"))
            }
            return e(/Android/i)
        };
        h.isMobile = function() {
            return h.isIOS() || h.isAndroid()
        };
        h.isIframe = function() {
            return (window.frameElement && (window.frameElement.nodeName === "IFRAME"))
        };
        h.saveCookie = function(m, n) {
            if (this.isSafari()) {
                n = encodeURI(n)
            }
            document.cookie = "jwplayer." + m + "=" + n + "; path=/"
        };
        h.getCookies = function() {
            var p = {};
            var o = document.cookie.split("; ");
            for (var n = 0; n < o.length; n++) {
                var m = o[n].split("=");
                if (m[0].indexOf("jwplayer.") === 0) {
                    if (this.isSafari()) {
                        var q = decodeURI(m[1]);
                        p[m[0].substring(9, m[0].length)] = q
                    } else {
                        p[m[0].substring(9, m[0].length)] = m[1]
                    }
                }
            }
            return p
        };
        h.isInt = function(m) {
            return parseFloat(m) % 1 === 0
        };
        h.typeOf = function(n) {
            if (n === null) {
                return "null"
            }
            var m = typeof n;
            if (m === "object") {
                if (i.isArray(n)) {
                    return "array"
                }
            }
            return m
        };
        h.translateEventResponse = function(o, m) {
            var q = h.extend({},
            m);
            if (o === c.events.JWPLAYER_FULLSCREEN && !q.fullscreen) {
                q.fullscreen = (q.message === "true");
                delete q.message
            } else {
                if (typeof q.data === "object") {
                    var p = q.data;
                    delete q.data;
                    q = h.extend(q, p)
                } else {
                    if (typeof q.metadata === "object") {
                        h.deepReplaceKeyName(q.metadata, ["__dot__", "__spc__", "__dsh__", "__default__"], [".", " ", "-", "default"])
                    }
                }
            }
            var n = ["position", "duration", "offset"];
            h.foreach(n,
            function(r, s) {
                if (q[s]) {
                    q[s] = Math.round(q[s] * 1000) / 1000
                }
            });
            return q
        };
        h.flashVersion = function() {
            if (h.isAndroid()) {
                return 0
            }
            var m = navigator.plugins,
            n;
            try {
                if (m !== "undefined") {
                    n = m["Shockwave Flash"];
                    if (n) {
                        return parseInt(n.description.replace(/\D+(\d+)\..*/, "$1"), 10)
                    }
                }
            } catch(p) {}
            if (typeof window.ActiveXObject !== "undefined") {
                try {
                    n = new window.ActiveXObject("ShockwaveFlash.ShockwaveFlash");
                    if (n) {
                        return parseInt(n.GetVariable("$version").split(" ")[1].split(",")[0], 10)
                    }
                } catch(o) {}
            }
            return 0
        };
        h.getScriptPath = function(o) {
            var m = document.getElementsByTagName("script");
            for (var n = 0; n < m.length; n++) {
                var p = m[n].src;
                if (p && p.indexOf(o) >= 0) {
                    return p.substr(0, p.indexOf(o))
                }
            }
            return ""
        };
        h.deepReplaceKeyName = function(p, n, m) {
            switch (c.utils.typeOf(p)) {
            case "array":
                for (var o = 0; o < p.length; o++) {
                    p[o] = c.utils.deepReplaceKeyName(p[o], n, m)
                }
                break;
            case "object":
                h.foreach(p,
                function(s, u) {
                    var t;
                    if (n instanceof Array && m instanceof Array) {
                        if (n.length !== m.length) {
                            return
                        } else {
                            t = n
                        }
                    } else {
                        t = [n]
                    }
                    var q = s;
                    for (var r = 0; r < t.length; r++) {
                        q = q.replace(new RegExp(n[r], "g"), m[r])
                    }
                    p[q] = c.utils.deepReplaceKeyName(u, n, m);
                    if (s !== q) {
                        delete p[s]
                    }
                });
                break
            }
            return p
        };
        var f = h.pluginPathType = {
            ABSOLUTE: 0,
            RELATIVE: 1,
            CDN: 2
        };
        h.getPluginPathType = function(n) {
            if (typeof n !== "string") {
                return
            }
            n = n.split("?")[0];
            var o = n.indexOf("://");
            if (o > 0) {
                return f.ABSOLUTE
            }
            var m = n.indexOf("/");
            var p = h.extension(n);
            if (o < 0 && m < 0 && (!p || !isNaN(p))) {
                return f.CDN
            }
            return f.RELATIVE
        };
        h.getPluginName = function(m) {
            return m.replace(/^(.*\/)?([^-]*)-?.*\.(swf|js)$/, "$2")
        };
        h.getPluginVersion = function(m) {
            return m.replace(/[^-]*-?([^\.]*).*$/, "$1")
        };
        h.isYouTube = function(n, m) {
            return (m === "youtube") || (/^(http|\/\/).*(youtube\.com|youtu\.be)\/.+/).test(n)
        };
        h.youTubeID = function(n) {
            try {
                return (/v[=\/]([^?&]*)|youtu\.be\/([^?]*)|^([\w-]*)$/i).exec(n).slice(1).join("").replace("?", "")
            } catch(m) {
                return ""
            }
        };
        h.isRtmp = function(m, n) {
            return (m.indexOf("rtmp") === 0 || n === "rtmp")
        };
        h.foreach = function(n, m) {
            var o, p;
            for (o in n) {
                if (h.typeOf(n.hasOwnProperty) === "function") {
                    if (n.hasOwnProperty(o)) {
                        p = n[o];
                        m(o, p)
                    }
                } else {
                    p = n[o];
                    m(o, p)
                }
            }
        };
        h.isHTTPS = function() {
            return (window.location.href.indexOf("https") === 0)
        };
        h.repo = function() {
            var m = "http://p.jwpcdn.com/" + c.version.split(/\W/).splice(0, 2).join("/") + "/";
            try {
                if (h.isHTTPS()) {
                    m = m.replace("http://", "https://ssl.")
                }
            } catch(n) {}
            return m
        };
        h.versionCheck = function(o) {
            var q = ("0" + o).split(/\W/);
            var p = c.version.split(/\W/);
            var n = parseFloat(q[0]);
            var m = parseFloat(p[0]);
            if (n > m) {
                return false
            } else {
                if (n === m) {
                    if (parseFloat("0" + q[1]) > parseFloat(p[1])) {
                        return false
                    }
                }
            }
            return true
        };
        h.ajax = function(s, q, m, r) {
            var o;
            var p = false;
            if (s.indexOf("#") > 0) {
                s = s.replace(/#.*$/, "")
            }
            if (b(s) && h.exists(window.XDomainRequest)) {
                o = new window.XDomainRequest();
                o.onload = k(o, s, q, m, r);
                o.ontimeout = o.onprogress = function() {};
                o.timeout = 5000
            } else {
                if (h.exists(window.XMLHttpRequest)) {
                    o = new window.XMLHttpRequest();
                    o.onreadystatechange = g(o, s, q, m, r)
                } else {
                    if (m) {
                        m("", s, o)
                    }
                    return o
                }
            }
            if (o.overrideMimeType) {
                o.overrideMimeType("text/xml")
            }
            o.onerror = j(m, s, o);
            try {
                o.open("GET", s, true)
            } catch(n) {
                p = true
            }
            setTimeout(function() {
                if (p) {
                    if (m) {
                        m(s, s, o)
                    }
                    return
                }
                try {
                    o.send()
                } catch(t) {
                    if (m) {
                        m(s, s, o)
                    }
                }
            },
            0);
            return o
        };
        function b(m) {
            return (m && m.indexOf("://") >= 0) && (m.split("/")[2] !== window.location.href.split("/")[2])
        }
        function j(m, o, n) {
            return function() {
                m("Error loading file", o, n)
            }
        }
        function g(n, q, o, m, p) {
            return function() {
                if (n.readyState === 4) {
                    switch (n.status) {
                    case 200:
                        k(n, q, o, m, p)();
                        break;
                    case 404:
                        m("File not found", q, n)
                    }
                }
            }
        }
        function k(n, q, o, m, p) {
            return function() {
                var r, u;
                if (p) {
                    o(n)
                } else {
                    try {
                        r = n.responseXML;
                        if (r) {
                            u = r.firstChild;
                            if (r.lastChild && r.lastChild.nodeName === "parsererror") {
                                if (m) {
                                    m("Invalid XML", q, n)
                                }
                                return
                            }
                        }
                    } catch(t) {}
                    if (r && u) {
                        return o(n)
                    }
                    var s = h.parseXML(n.responseText);
                    if (s && s.firstChild) {
                        n = h.extend({},
                        n, {
                            responseXML: s
                        })
                    } else {
                        if (m) {
                            m(n.responseText ? "Invalid XML": q, q, n)
                        }
                        return
                    }
                    o(n)
                }
            }
        }
        h.parseXML = function(m) {
            var n;
            try {
                if (window.DOMParser) {
                    n = (new window.DOMParser()).parseFromString(m, "text/xml");
                    if (n.childNodes && n.childNodes.length && n.childNodes[0].firstChild.nodeName === "parsererror") {
                        return
                    }
                } else {
                    n = new window.ActiveXObject("Microsoft.XMLDOM");
                    n.async = "false";
                    n.loadXML(m)
                }
            } catch(o) {
                return
            }
            return n
        };
        h.between = function(n, o, m) {
            return Math.max(Math.min(n, m), o)
        };
        h.seconds = function(o) {
            if (i.isNumber(o)) {
                return o
            }
            o = o.replace(",", ".");
            var m = o.split(":");
            var n = 0;
            if (o.slice( - 1) === "s") {
                n = parseFloat(o)
            } else {
                if (o.slice( - 1) === "m") {
                    n = parseFloat(o) * 60
                } else {
                    if (o.slice( - 1) === "h") {
                        n = parseFloat(o) * 3600
                    } else {
                        if (m.length > 1) {
                            n = parseFloat(m[m.length - 1]);
                            n += parseFloat(m[m.length - 2]) * 60;
                            if (m.length === 3) {
                                n += parseFloat(m[m.length - 3]) * 3600
                            }
                        } else {
                            n = parseFloat(o)
                        }
                    }
                }
            }
            return n
        };
        h.serialize = function(m) {
            if (m === null) {
                return null
            } else {
                if (m.toString().toLowerCase() === "true") {
                    return true
                } else {
                    if (m.toString().toLowerCase() === "false") {
                        return false
                    } else {
                        if (isNaN(Number(m)) || m.length > 5 || m.length === 0) {
                            return m
                        } else {
                            return Number(m)
                        }
                    }
                }
            }
        };
        h.addClass = function(o, n) {
            var m = i.isString(o.className) ? o.className.split(" ") : [];
            var p = i.isArray(n) ? n: n.split(" ");
            i.each(p,
            function(q) {
                if (!i.contains(m, q)) {
                    m.push(q)
                }
            });
            o.className = h.trim(m.join(" "))
        };
        h.removeClass = function(o, p) {
            var n = i.isString(o.className) ? o.className.split(" ") : [];
            var m = i.isArray(p) ? p: p.split(" ");
            o.className = h.trim(i.difference(n, m).join(" "))
        };
        h.emptyElement = function(m) {
            while (m.firstChild) {
                m.removeChild(m.firstChild)
            }
        };
        h.indexOf = i.indexOf;
        h.noop = function() {};
        h.canCast = function() {
            var m = c.cast;
            return !! (m && i.isFunction(m.available) && m.available())
        }
    })(jwplayer); (function(j) {
        var p = j.utils,
        g = 50000,
        b = {},
        s, a = {},
        i = null,
        o = {},
        c = false;
        function q(u) {
            var v = document.createElement("style");
            if (u) {
                v.appendChild(document.createTextNode(u))
            }
            v.type = "text/css";
            document.getElementsByTagName("head")[0].appendChild(v);
            return v
        }
        p.cssKeyframes = function(x, y) {
            var v = b.keyframes;
            if (!v) {
                v = q();
                b.keyframes = v
            }
            var w = v.sheet;
            var u = "@keyframes " + x + " { " + y + " }";
            n(w, u, w.cssRules.length);
            n(w, u.replace(/(keyframes|transform)/g, "-webkit-$1"), w.cssRules.length)
        };
        var k = p.css = function(v, x, w) {
            w = w || false;
            if (!a[v]) {
                a[v] = {}
            }
            if (!d(a[v], x, w)) {
                return
            }
            if (c) {
                if (b[v]) {
                    b[v].parentNode.removeChild(b[v])
                }
                b[v] = q(r(v));
                return
            }
            if (!b[v]) {
                var u = s && s.sheet && s.sheet.cssRules && s.sheet.cssRules.length || 0;
                if (!s || u > g) {
                    s = q()
                }
                b[v] = s
            }
            if (i !== null) {
                i.styleSheets[v] = a[v];
                return
            }
            f(v)
        };
        k.style = function(x, w, u) {
            if (x === undefined || x === null) {
                return
            }
            if (x.length === undefined) {
                x = [x]
            }
            var v = {};
            t(v, w);
            if (i !== null && !u) {
                x.__cssRules = e(x.__cssRules, v);
                if (j._.indexOf(i.elements, x) < 0) {
                    i.elements.push(x)
                }
                return
            }
            m(x, v)
        };
        k.block = function(u) {
            if (i === null) {
                i = {
                    id: u,
                    styleSheets: {},
                    elements: []
                }
            }
        };
        k.unblock = function(x) {
            if (i && (!x || i.id === x)) {
                for (var u in i.styleSheets) {
                    f(u)
                }
                for (var v = 0; v < i.elements.length; v++) {
                    var w = i.elements[v];
                    m(w, w.__cssRules)
                }
                i = null
            }
        };
        function e(v, u) {
            v = v || {};
            for (var w in u) {
                v[w] = u[w]
            }
            return v
        }
        function d(v, y, u) {
            var x = false,
            w, z;
            for (w in y) {
                z = h(w, y[w], u);
                if (z !== "") {
                    if (z !== v[w]) {
                        v[w] = z;
                        x = true
                    }
                } else {
                    if (v[w] !== undefined) {
                        delete v[w];
                        x = true
                    }
                }
            }
            return x
        }
        function t(u, w) {
            for (var v in w) {
                u[v] = h(v, w[v])
            }
        }
        function l(u) {
            u = u.split("-");
            for (var v = 1; v < u.length; v++) {
                u[v] = u[v].charAt(0).toUpperCase() + u[v].slice(1)
            }
            return u.join("")
        }
        function h(w, x, u) {
            if (!p.exists(x)) {
                return ""
            }
            var v = u ? " !important": "";
            if (typeof x === "string" && isNaN(x)) {
                if ((/png|gif|jpe?g/i).test(x) && x.indexOf("url") < 0) {
                    return "url(" + x + ")"
                }
                return x + v
            }
            if (x === 0 || w === "z-index" || w === "opacity") {
                return "" + x + v
            }
            if ((/color/i).test(w)) {
                return "#" + p.pad(x.toString(16).replace(/^0x/i, ""), 6) + v
            }
            return Math.ceil(x) + "px" + v
        }
        function m(z, u) {
            for (var x = 0; x < z.length; x++) {
                var w = z[x],
                y,
                v;
                if (w !== undefined && w !== null) {
                    for (y in u) {
                        v = l(y);
                        if (w.style[v] !== u[y]) {
                            w.style[v] = u[y]
                        }
                    }
                }
            }
        }
        function f(u) {
            var x = b[u].sheet,
            w,
            y,
            v;
            if (x) {
                w = x.cssRules;
                y = o[u];
                v = r(u);
                if (y !== undefined && y < w.length && w[y].selectorText === u) {
                    if (v === w[y].cssText) {
                        return
                    }
                    x.deleteRule(y)
                } else {
                    y = w.length;
                    o[u] = y
                }
                n(x, v, y)
            }
        }
        function n(v, x, u) {
            try {
                v.insertRule(x, u)
            } catch(w) {}
        }
        function r(u) {
            var w = a[u];
            u += " { ";
            for (var v in w) {
                u += v + ": " + w[v] + "; "
            }
            return u + "}"
        }
        p.clearCss = function(v) {
            for (var w in a) {
                if (w.indexOf(v) >= 0) {
                    delete a[w]
                }
            }
            for (var u in b) {
                if (u.indexOf(v) >= 0) {
                    f(u)
                }
            }
        };
        p.transform = function(v, x) {
            var u = "transform",
            w = {};
            x = x || "";
            w[u] = x;
            w["-webkit-" + u] = x;
            w["-ms-" + u] = x;
            w["-moz-" + u] = x;
            w["-o-" + u] = x;
            if (typeof v === "string") {
                k(v, w)
            } else {
                k.style(v, w)
            }
        };
        p.dragStyle = function(u, v) {
            k(u, {
                "-webkit-user-select": v,
                "-moz-user-select": v,
                "-ms-user-select": v,
                "-webkit-user-drag": v,
                "user-select": v,
                "user-drag": v
            })
        };
        p.transitionStyle = function(u, v) {
            if (navigator.userAgent.match(/5\.\d(\.\d)? safari/i)) {
                return
            }
            k(u, {
                "-webkit-transition": v,
                "-moz-transition": v,
                "-o-transition": v,
                transition: v
            })
        };
        p.rotate = function(u, v) {
            p.transform(u, "rotate(" + v + "deg)")
        };
        p.rgbHex = function(u) {
            var v = String(u).replace("#", "");
            if (v.length === 3) {
                v = v[0] + v[0] + v[1] + v[1] + v[2] + v[2]
            }
            return "#" + v.substr( - 6)
        };
        p.hexToRgba = function(w, v) {
            var x = "rgb";
            var u = [parseInt(w.substr(1, 2), 16), parseInt(w.substr(3, 2), 16), parseInt(w.substr(5, 2), 16)];
            if (v !== undefined && v !== 100) {
                x += "a";
                u.push(v / 100)
            }
            return x + "(" + u.join(",") + ")"
        }
    })(jwplayer); (function(o) {
        var e = "video/",
        h = "audio/",
        j = "mp4",
        c = "webm",
        n = "ogg",
        b = "aac",
        k = "mp3",
        l = "vorbis",
        p = jwplayer._,
        d = o.foreach,
        m = {
            mp4: e + j,
            ogg: e + n,
            oga: h + n,
            vorbis: h + n,
            webm: e + c,
            aac: h + j,
            mp3: h + "mpeg",
            hls: "application/vnd.apple.mpegurl"
        },
        g = {
            mp4: m[j],
            f4v: m[j],
            m4v: m[j],
            mov: m[j],
            m4a: m[b],
            f4a: m[b],
            aac: m[b],
            mp3: m[k],
            ogv: m[n],
            ogg: m[n],
            oga: m[l],
            vorbis: m[l],
            webm: m[c],
            m3u8: m.hls,
            m3u: m.hls,
            hls: m.hls
        },
        i = "video",
        f = {
            flv: i,
            f4v: i,
            mov: i,
            m4a: i,
            m4v: i,
            mp4: i,
            aac: i,
            f4a: i,
            mp3: "sound",
            smil: "rtmp",
            m3u8: "hls",
            hls: "hls"
        };
        var a = o.extensionmap = {};
        d(g,
        function(q, r) {
            a[q] = {
                html5: r
            }
        });
        d(f,
        function(q, r) {
            if (!a[q]) {
                a[q] = {}
            }
            a[q].flash = r
        });
        a.types = m;
        a.mimeType = function(r) {
            var q;
            p.find(m,
            function(t, s) {
                if (t === r) {
                    q = s;
                    return true
                }
            });
            return q
        };
        a.extType = function(q) {
            return a.mimeType(g[q])
        }
    })(jwplayer.utils); (function(b) {
        var a = b.loaderstatus = {
            NEW: 0,
            LOADING: 1,
            ERROR: 2,
            COMPLETE: 3
        };
        b.scriptloader = function(c) {
            var f = jwplayer.events,
            h = b.extend(this, new f.eventdispatcher()),
            d = a.NEW;
            this.load = function() {
                if (d !== a.NEW) {
                    return
                }
                var l = b.scriptloader.loaders[c];
                if (l) {
                    d = l.getStatus();
                    if (d < 2) {
                        l.addEventListener(f.ERROR, e);
                        l.addEventListener(f.COMPLETE, g);
                        return
                    }
                }
                var j = document.getElementsByTagName("head")[0] || document.documentElement;
                var k = document.createElement("script");
                var i = false;
                k.onload = k.onreadystatechange = function(m) {
                    if (!i && (!this.readyState || this.readyState === "loaded" || this.readyState === "complete")) {
                        i = true;
                        g(m);
                        k.onload = k.onreadystatechange = null;
                        if (j && k.parentNode) {
                            j.removeChild(k)
                        }
                    }
                };
                k.onerror = e;
                k.src = c;
                j.insertBefore(k, j.firstChild);
                d = a.LOADING;
                b.scriptloader.loaders[c] = this
            };
            function e(i) {
                d = a.ERROR;
                h.sendEvent(f.ERROR, i)
            }
            function g(i) {
                d = a.COMPLETE;
                h.sendEvent(f.COMPLETE, i)
            }
            this.getStatus = function() {
                return d
            }
        };
        b.scriptloader.loaders = {}
    })(jwplayer.utils); (function(a) {
        a.trim = function(c) {
            return c.replace(/^\s+|\s+$/g, "")
        };
        a.pad = function(e, d, c) {
            if (!c) {
                c = "0"
            }
            while (e.length < d) {
                e = c + e
            }
            return e
        };
        a.xmlAttribute = function(c, d) {
            for (var e = 0; e < c.attributes.length; e++) {
                if (c.attributes[e].name && c.attributes[e].name.toLowerCase() === d.toLowerCase()) {
                    return c.attributes[e].value.toString()
                }
            }
            return ""
        };
        function b(c) {
            if (c.indexOf("(format=m3u8-") > -1) {
                return "m3u8"
            } else {
                return false
            }
        }
        a.extension = function(d) {
            if (!d || d.substr(0, 4) === "rtmp") {
                return ""
            }
            var c = b(d);
            if (c) {
                return c
            }
            d = d.substring(d.lastIndexOf("/") + 1, d.length).split("?")[0].split("#")[0];
            if (d.lastIndexOf(".") > -1) {
                return d.substr(d.lastIndexOf(".") + 1, d.length).toLowerCase()
            }
        };
        a.stringToColor = function(c) {
            c = c.replace(/(#|0x)?([0-9A-F]{3,6})$/gi, "$2");
            if (c.length === 3) {
                c = c.charAt(0) + c.charAt(0) + c.charAt(1) + c.charAt(1) + c.charAt(2) + c.charAt(2)
            }
            return parseInt(c, 16)
        }
    })(jwplayer.utils); (function(b) {
        var c = "touchmove",
        d = "touchstart",
        a = "touchend",
        e = "touchcancel";
        b.touch = function(f) {
            var q = f,
            k = false,
            g = {},
            i = null,
            l = false,
            j = b.touchEvents;
            document.addEventListener(c, h);
            document.addEventListener(a, n);
            document.addEventListener(e, h);
            f.addEventListener(d, h);
            f.addEventListener(a, h);
            function n(r) {
                if (k) {
                    if (l) {
                        o(j.DRAG_END, r)
                    }
                }
                l = false;
                k = false;
                i = null
            }
            function h(r) {
                if (r.type === d) {
                    k = true;
                    i = p(j.DRAG_START, r)
                } else {
                    if (r.type === c) {
                        if (k) {
                            if (l) {
                                o(j.DRAG, r)
                            } else {
                                o(j.DRAG_START, r, i);
                                l = true;
                                o(j.DRAG, r)
                            }
                        }
                    } else {
                        if (k) {
                            if (l) {
                                o(j.DRAG_END, r)
                            } else {
                                r.cancelBubble = true;
                                o(j.TAP, r)
                            }
                        }
                        l = false;
                        k = false;
                        i = null
                    }
                }
            }
            function o(s, t, u) {
                if (g[s]) {
                    m(t);
                    var r = u ? u: p(s, t);
                    if (r) {
                        g[s](r)
                    }
                }
            }
            function p(s, u) {
                var v = null;
                if (u.touches && u.touches.length) {
                    v = u.touches[0]
                } else {
                    if (u.changedTouches && u.changedTouches.length) {
                        v = u.changedTouches[0]
                    }
                }
                if (!v) {
                    return null
                }
                var t = q.getBoundingClientRect();
                var r = {
                    type: s,
                    target: q,
                    x: ((v.pageX - window.pageXOffset) - t.left),
                    y: v.pageY,
                    deltaX: 0,
                    deltaY: 0
                };
                if (s !== j.TAP && i) {
                    r.deltaX = r.x - i.x;
                    r.deltaY = r.y - i.y
                }
                return r
            }
            function m(r) {
                if (r.preventManipulation) {
                    r.preventManipulation()
                }
                if (r.preventDefault) {
                    r.preventDefault()
                }
            }
            this.addEventListener = function(s, r) {
                g[s] = r
            };
            this.removeEventListener = function(r) {
                delete g[r]
            };
            return this
        }
    })(jwplayer.utils); (function(a) {
        a.touchEvents = {
            DRAG: "jwplayerDrag",
            DRAG_START: "jwplayerDragStart",
            DRAG_END: "jwplayerDragEnd",
            TAP: "jwplayerTap"
        }
    })(jwplayer.utils); (function(a) {
        a.events = {
            COMPLETE: "COMPLETE",
            ERROR: "ERROR",
            API_READY: "jwplayerAPIReady",
            JWPLAYER_READY: "jwplayerReady",
            JWPLAYER_FULLSCREEN: "jwplayerFullscreen",
            JWPLAYER_RESIZE: "jwplayerResize",
            JWPLAYER_ERROR: "jwplayerError",
            JWPLAYER_SETUP_ERROR: "jwplayerSetupError",
            JWPLAYER_MEDIA_BEFOREPLAY: "jwplayerMediaBeforePlay",
            JWPLAYER_MEDIA_BEFORECOMPLETE: "jwplayerMediaBeforeComplete",
            JWPLAYER_MEDIA_BUFFER: "jwplayerMediaBuffer",
            JWPLAYER_MEDIA_BUFFER_FULL: "jwplayerMediaBufferFull",
            JWPLAYER_MEDIA_ERROR: "jwplayerMediaError",
            JWPLAYER_MEDIA_LOADED: "jwplayerMediaLoaded",
            JWPLAYER_MEDIA_COMPLETE: "jwplayerMediaComplete",
            JWPLAYER_MEDIA_SEEK: "jwplayerMediaSeek",
            JWPLAYER_MEDIA_TIME: "jwplayerMediaTime",
            JWPLAYER_MEDIA_VOLUME: "jwplayerMediaVolume",
            JWPLAYER_MEDIA_META: "jwplayerMediaMeta",
            JWPLAYER_MEDIA_MUTE: "jwplayerMediaMute",
            JWPLAYER_AUDIO_TRACKS: "jwplayerAudioTracks",
            JWPLAYER_AUDIO_TRACK_CHANGED: "jwplayerAudioTrackChanged",
            JWPLAYER_MEDIA_LEVELS: "jwplayerMediaLevels",
            JWPLAYER_MEDIA_LEVEL_CHANGED: "jwplayerMediaLevelChanged",
            JWPLAYER_CAPTIONS_CHANGED: "jwplayerCaptionsChanged",
            JWPLAYER_CAPTIONS_LIST: "jwplayerCaptionsList",
            JWPLAYER_CAPTIONS_LOADED: "jwplayerCaptionsLoaded",
            JWPLAYER_PLAYER_STATE: "jwplayerPlayerState",
            state: {
                BUFFERING: "BUFFERING",
                IDLE: "IDLE",
                PAUSED: "PAUSED",
                PLAYING: "PLAYING"
            },
            JWPLAYER_PLAYLIST_LOADED: "jwplayerPlaylistLoaded",
            JWPLAYER_PLAYLIST_ITEM: "jwplayerPlaylistItem",
            JWPLAYER_PLAYLIST_COMPLETE: "jwplayerPlaylistComplete",
            JWPLAYER_DISPLAY_CLICK: "jwplayerViewClick",
            JWPLAYER_PROVIDER_CLICK: "jwplayerProviderClick",
            JWPLAYER_VIEW_TAB_FOCUS: "jwplayerViewTabFocus",
            JWPLAYER_CONTROLS: "jwplayerViewControls",
            JWPLAYER_USER_ACTION: "jwplayerUserAction",
            JWPLAYER_INSTREAM_CLICK: "jwplayerInstreamClicked",
            JWPLAYER_INSTREAM_DESTROYED: "jwplayerInstreamDestroyed",
            JWPLAYER_AD_TIME: "jwplayerAdTime",
            JWPLAYER_AD_ERROR: "jwplayerAdError",
            JWPLAYER_AD_CLICK: "jwplayerAdClicked",
            JWPLAYER_AD_COMPLETE: "jwplayerAdComplete",
            JWPLAYER_AD_IMPRESSION: "jwplayerAdImpression",
            JWPLAYER_AD_COMPANIONS: "jwplayerAdCompanions",
            JWPLAYER_AD_SKIPPED: "jwplayerAdSkipped",
            JWPLAYER_AD_PLAY: "jwplayerAdPlay",
            JWPLAYER_AD_PAUSE: "jwplayerAdPause",
            JWPLAYER_AD_META: "jwplayerAdMeta",
            JWPLAYER_CAST_AVAILABLE: "jwplayerCastAvailable",
            JWPLAYER_CAST_SESSION: "jwplayerCastSession",
            JWPLAYER_CAST_AD_CHANGED: "jwplayerCastAdChanged"
        }
    })(jwplayer); (function(a) {
        var b = a.events,
        c = a.utils;
        b.eventdispatcher = function(j, d) {
            var f = j,
            h = d,
            g, e;
            this.resetEventListeners = function() {
                g = {};
                e = []
            };
            this.resetEventListeners();
            this.addEventListener = function(k, n, m) {
                try {
                    if (!c.exists(g[k])) {
                        g[k] = []
                    }
                    if (c.typeOf(n) === "string") {
                        n = (new Function("return " + n))()
                    }
                    g[k].push({
                        listener: n,
                        count: m || null
                    })
                } catch(l) {
                    c.log("error", l)
                }
                return false
            };
            this.removeEventListener = function(l, n) {
                var k;
                if (!g[l]) {
                    return
                }
                try {
                    if (n === undefined) {
                        g[l] = [];
                        return
                    }
                    for (k = 0; k < g[l].length; k++) {
                        if (g[l][k].listener.toString() === n.toString()) {
                            g[l].splice(k, 1);
                            break
                        }
                    }
                } catch(m) {
                    c.log("error", m)
                }
                return false
            };
            this.addGlobalListener = function(m, l) {
                try {
                    if (c.typeOf(m) === "string") {
                        m = (new Function("return " + m))()
                    }
                    e.push({
                        listener: m,
                        count: l || null
                    })
                } catch(k) {
                    c.log("error", k)
                }
                return false
            };
            this.removeGlobalListener = function(m) {
                if (!m) {
                    return
                }
                try {
                    for (var k = e.length; k--;) {
                        if (e[k].listener.toString() === m.toString()) {
                            e.splice(k, 1)
                        }
                    }
                } catch(l) {
                    c.log("error", l)
                }
                return false
            };
            this.sendEvent = function(k, l) {
                if (!c.exists(l)) {
                    l = {}
                }
                c.extend(l, {
                    id: f,
                    version: a.version,
                    type: k
                });
                if (h) {
                    c.log(k, l)
                }
                i(g[k], l, k);
                i(e, l, k)
            };
            function i(m, p, l) {
                if (!m) {
                    return
                }
                for (var k = 0; k < m.length; k++) {
                    var o = m[k];
                    if (o) {
                        if (o.count !== null && --o.count === 0) {
                            delete m[k]
                        }
                        try {
                            o.listener(p)
                        } catch(n) {
                            c.log('Error handling "' + l + '" event listener [' + k + "]: " + n.toString(), o.listener, p)
                        }
                    }
                }
            }
        }
    })(window.jwplayer); (function(a) {
        var c = {},
        b = {};
        a.plugins = function() {};
        a.plugins.loadPlugins = function(e, d) {
            b[e] = new a.plugins.pluginloader(new a.plugins.model(c), d);
            return b[e]
        };
        a.plugins.registerPlugin = function(h, g, f, e) {
            var d = a.utils.getPluginName(h);
            if (!c[d]) {
                c[d] = new a.plugins.plugin(h)
            }
            c[d].registerPlugin(h, g, f, e)
        }
    })(jwplayer); (function(a) {
        a.plugins.model = function(b) {
            this.addPlugin = function(c) {
                var d = a.utils.getPluginName(c);
                if (!b[d]) {
                    b[d] = new a.plugins.plugin(c)
                }
                return b[d]
            };
            this.getPlugins = function() {
                return b
            }
        }
    })(jwplayer); (function(b) {
        var a = jwplayer.utils,
        c = jwplayer.events,
        d = "undefined";
        b.pluginmodes = {
            FLASH: 0,
            JAVASCRIPT: 1,
            HYBRID: 2
        };
        b.plugin = function(e) {
            var l = a.loaderstatus.NEW,
            m, k, f, n;
            var g = new c.eventdispatcher();
            a.extend(this, g);
            function h() {
                switch (a.getPluginPathType(e)) {
                case a.pluginPathType.ABSOLUTE:
                    return e;
                case a.pluginPathType.RELATIVE:
                    return a.getAbsolutePath(e, window.location.href)
                }
            }
            function j() {
                n = setTimeout(function() {
                    l = a.loaderstatus.COMPLETE;
                    g.sendEvent(c.COMPLETE)
                },
                1000)
            }
            function i() {
                l = a.loaderstatus.ERROR;
                g.sendEvent(c.ERROR, {
                    url: e
                })
            }
            this.load = function() {
                if (l === a.loaderstatus.NEW) {
                    if (e.lastIndexOf(".swf") > 0) {
                        m = e;
                        l = a.loaderstatus.COMPLETE;
                        g.sendEvent(c.COMPLETE);
                        return
                    } else {
                        if (a.getPluginPathType(e) === a.pluginPathType.CDN) {
                            l = a.loaderstatus.COMPLETE;
                            g.sendEvent(c.COMPLETE);
                            return
                        }
                    }
                    l = a.loaderstatus.LOADING;
                    var o = new a.scriptloader(h());
                    o.addEventListener(c.COMPLETE, j);
                    o.addEventListener(c.ERROR, i);
                    o.load()
                }
            };
            this.registerPlugin = function(r, q, p, o) {
                if (n) {
                    clearTimeout(n);
                    n = undefined
                }
                f = q;
                if (p && o) {
                    m = o;
                    k = p
                } else {
                    if (typeof p === "string") {
                        m = p
                    } else {
                        if (typeof p === "function") {
                            k = p
                        } else {
                            if (!p && !o) {
                                m = r
                            }
                        }
                    }
                }
                l = a.loaderstatus.COMPLETE;
                g.sendEvent(c.COMPLETE)
            };
            this.getStatus = function() {
                return l
            };
            this.getPluginName = function() {
                return a.getPluginName(e)
            };
            this.getFlashPath = function() {
                if (m) {
                    switch (a.getPluginPathType(m)) {
                    case a.pluginPathType.ABSOLUTE:
                        return m;
                    case a.pluginPathType.RELATIVE:
                        if (e.lastIndexOf(".swf") > 0) {
                            return a.getAbsolutePath(m, window.location.href)
                        }
                        return a.getAbsolutePath(m, h())
                    }
                }
                return null
            };
            this.getJS = function() {
                return k
            };
            this.getTarget = function() {
                return f
            };
            this.getPluginmode = function() {
                if (typeof m !== d && typeof k !== d) {
                    return b.pluginmodes.HYBRID
                } else {
                    if (typeof m !== d) {
                        return b.pluginmodes.FLASH
                    } else {
                        if (typeof k !== d) {
                            return b.pluginmodes.JAVASCRIPT
                        }
                    }
                }
            };
            this.getNewInstance = function(p, o, q) {
                return new k(p, o, q)
            };
            this.getURL = function() {
                return e
            }
        }
    })(jwplayer.plugins); (function(c) {
        var a = c.utils,
        d = c.events,
        b = c._,
        e = a.foreach;
        c.plugins.pluginloader = function(m, k) {
            var q = a.loaderstatus.NEW,
            j = false,
            f = false,
            o = k,
            l = b.size(o),
            r,
            h = false,
            g = new d.eventdispatcher();
            a.extend(this, g);
            function i() {
                if (!f) {
                    f = true;
                    q = a.loaderstatus.COMPLETE;
                    g.sendEvent(d.COMPLETE)
                }
            }
            function p() {
                if (h) {
                    return
                }
                if (!o || b.keys(o).length === 0) {
                    i()
                }
                if (!f) {
                    var s = m.getPlugins();
                    r = b.after(l, i);
                    a.foreach(o,
                    function(u) {
                        var v = a.getPluginName(u),
                        y = s[v],
                        x = y.getJS(),
                        w = y.getTarget(),
                        t = y.getStatus();
                        if (t === a.loaderstatus.LOADING || t === a.loaderstatus.NEW) {
                            return
                        } else {
                            if (x && !a.versionCheck(w)) {
                                g.sendEvent(d.ERROR, {
                                    message: "Incompatible player version"
                                })
                            }
                        }
                        r()
                    })
                }
            }
            function n(t) {
                if (h) {
                    return
                }
                var s = "File not found";
                g.sendEvent(d.ERROR, {
                    message: s
                });
                if (t.url) {
                    a.log(s, t.url)
                }
                p()
            }
            this.setupPlugins = function(v, t, x) {
                var u = {
                    length: 0,
                    plugins: {}
                },
                w = {
                    length: 0,
                    plugins: {}
                },
                s = m.getPlugins();
                e(t.plugins,
                function(B, D) {
                    var C = a.getPluginName(B),
                    E = s[C],
                    F = E.getFlashPath(),
                    G = E.getJS(),
                    y = E.getURL();
                    if (F) {
                        u.plugins[F] = a.extend({},
                        D);
                        u.plugins[F].pluginmode = E.getPluginmode();
                        u.length++
                    }
                    try {
                        if (G && t.plugins && t.plugins[y]) {
                            var z = document.createElement("div");
                            z.id = v.id + "_" + C;
                            z.style.position = "absolute";
                            z.style.top = 0;
                            z.style.zIndex = w.length + 10;
                            w.plugins[C] = E.getNewInstance(v, a.extend({},
                            t.plugins[y]), z);
                            w.length++;
                            v.onReady(x(w.plugins[C], z, true));
                            v.onResize(x(w.plugins[C], z))
                        }
                    } catch(A) {
                        a.log("ERROR: Failed to load " + C + ".")
                    }
                });
                v.plugins = w.plugins;
                return u
            };
            this.load = function() {
                if (a.exists(k) && a.typeOf(k) !== "object") {
                    p();
                    return
                }
                q = a.loaderstatus.LOADING;
                j = true;
                e(k,
                function(t) {
                    if (a.exists(t)) {
                        var u = m.addPlugin(t);
                        u.addEventListener(d.COMPLETE, p);
                        u.addEventListener(d.ERROR, n)
                    }
                });
                var s = m.getPlugins();
                e(s,
                function(t, u) {
                    u.load()
                });
                j = false;
                p()
            };
            this.destroy = function() {
                h = true;
                if (g) {
                    g.resetEventListeners();
                    g = null
                }
            };
            this.pluginFailed = n;
            this.getStatus = function() {
                return q
            }
        }
    })(jwplayer); (function(a) {
        a.parsers = {
            localName: function(b) {
                if (!b) {
                    return ""
                } else {
                    if (b.localName) {
                        return b.localName
                    } else {
                        if (b.baseName) {
                            return b.baseName
                        } else {
                            return ""
                        }
                    }
                }
            },
            textContent: function(b) {
                if (!b) {
                    return ""
                } else {
                    if (b.textContent) {
                        return a.utils.trim(b.textContent)
                    } else {
                        if (b.text) {
                            return a.utils.trim(b.text)
                        } else {
                            return ""
                        }
                    }
                }
            },
            getChildNode: function(c, b) {
                return c.childNodes[b]
            },
            numChildren: function(b) {
                if (b.childNodes) {
                    return b.childNodes.length
                } else {
                    return 0
                }
            }
        }
    })(jwplayer); (function(b) {
        var a = b.parsers;
        var d = a.jwparser = function() {};
        var c = "jwplayer";
        d.parseEntry = function(l, p) {
            var e = [],
            n = [],
            m = b.utils.xmlAttribute,
            f = "default",
            q = "label",
            j = "file",
            o = "type";
            for (var k = 0; k < l.childNodes.length; k++) {
                var h = l.childNodes[k];
                if (h.prefix === c) {
                    var g = a.localName(h);
                    if (g === "source") {
                        delete p.sources;
                        e.push({
                            file: m(h, j),
                            "default": m(h, f),
                            label: m(h, q),
                            type: m(h, o)
                        })
                    } else {
                        if (g === "track") {
                            delete p.tracks;
                            n.push({
                                file: m(h, j),
                                "default": m(h, f),
                                kind: m(h, "kind"),
                                label: m(h, q)
                            })
                        } else {
                            p[g] = b.utils.serialize(a.textContent(h));
                            if (g === "file" && p.sources) {
                                delete p.sources
                            }
                        }
                    }
                }
                if (!p[j]) {
                    p[j] = p.link
                }
            }
            if (e.length) {
                p.sources = [];
                for (k = 0; k < e.length; k++) {
                    if (e[k].file.length > 0) {
                        e[k][f] = (e[k][f] === "true") ? true: false;
                        if (!e[k].label.length) {
                            delete e[k].label
                        }
                        p.sources.push(e[k])
                    }
                }
            }
            if (n.length) {
                p.tracks = [];
                for (k = 0; k < n.length; k++) {
                    if (n[k].file.length > 0) {
                        n[k][f] = (n[k][f] === "true") ? true: false;
                        n[k].kind = (!n[k].kind.length) ? "captions": n[k].kind;
                        if (!n[k].label.length) {
                            delete n[k].label
                        }
                        p.tracks.push(n[k])
                    }
                }
            }
            return p
        }
    })(jwplayer); (function(e) {
        var b = jwplayer.utils,
        h = b.xmlAttribute,
        c = e.localName,
        a = e.textContent,
        d = e.numChildren;
        var g = e.mediaparser = function() {};
        var f = "media";
        g.parseGroup = function(o, q) {
            var n, l, k = "tracks",
            j = [];
            function p(i) {
                var r = {
                    zh: "Chinese",
                    nl: "Dutch",
                    en: "English",
                    fr: "French",
                    de: "German",
                    it: "Italian",
                    ja: "Japanese",
                    pt: "Portuguese",
                    ru: "Russian",
                    es: "Spanish"
                };
                if (r[i]) {
                    return r[i]
                }
                return i
            }
            for (l = 0; l < d(o); l++) {
                n = o.childNodes[l];
                if (n.prefix === f) {
                    if (!c(n)) {
                        continue
                    }
                    switch (c(n).toLowerCase()) {
                    case "content":
                        if (h(n, "duration")) {
                            q.duration = b.seconds(h(n, "duration"))
                        }
                        if (d(n) > 0) {
                            q = g.parseGroup(n, q)
                        }
                        if (h(n, "url")) {
                            if (!q.sources) {
                                q.sources = []
                            }
                            q.sources.push({
                                file: h(n, "url"),
                                type: h(n, "type"),
                                width: h(n, "width"),
                                label: h(n, "label")
                            })
                        }
                        break;
                    case "title":
                        q.title = a(n);
                        break;
                    case "description":
                        q.description = a(n);
                        break;
                    case "guid":
                        q.mediaid = a(n);
                        break;
                    case "thumbnail":
                        if (!q.image) {
                            q.image = h(n, "url")
                        }
                        break;
                    case "player":
                        break;
                    case "group":
                        g.parseGroup(n, q);
                        break;
                    case "subtitle":
                        var m = {};
                        m.file = h(n, "url");
                        m.kind = "captions";
                        if (h(n, "lang").length > 0) {
                            m.label = p(h(n, "lang"))
                        }
                        j.push(m)
                    }
                }
            }
            if (!q.hasOwnProperty(k)) {
                q[k] = []
            }
            for (l = 0; l < j.length; l++) {
                q[k].push(j[l])
            }
            return q
        }
    })(jwplayer.parsers); (function(g) {
        var b = jwplayer.utils,
        a = g.textContent,
        e = g.getChildNode,
        f = g.numChildren,
        d = g.localName;
        g.rssparser = {};
        g.rssparser.parse = function(o) {
            var h = [];
            for (var m = 0; m < f(o); m++) {
                var n = e(o, m),
                k = d(n).toLowerCase();
                if (k === "channel") {
                    for (var l = 0; l < f(n); l++) {
                        var p = e(n, l);
                        if (d(p).toLowerCase() === "item") {
                            h.push(c(p))
                        }
                    }
                }
            }
            return h
        };
        function c(l) {
            var m = {};
            for (var j = 0; j < l.childNodes.length; j++) {
                var k = l.childNodes[j];
                var h = d(k);
                if (!h) {
                    continue
                }
                switch (h.toLowerCase()) {
                case "enclosure":
                    m.file = b.xmlAttribute(k, "url");
                    break;
                case "title":
                    m.title = a(k);
                    break;
                case "guid":
                    m.mediaid = a(k);
                    break;
                case "pubdate":
                    m.date = a(k);
                    break;
                case "description":
                    m.description = a(k);
                    break;
                case "link":
                    m.link = a(k);
                    break;
                case "category":
                    if (m.tags) {
                        m.tags += a(k)
                    } else {
                        m.tags = a(k)
                    }
                    break
                }
            }
            m = g.mediaparser.parseGroup(l, m);
            m = g.jwparser.parseEntry(l, m);
            return new jwplayer.playlist.item(m)
        }
    })(jwplayer.parsers); (function(d) {
        var b = d.utils;
        var c = d._;
        d.playlist = function(f) {
            var g = [];
            f = (c.isArray(f) ? f: [f]);
            c.each(f,
            function(h) {
                g.push(new d.playlist.item(h))
            });
            return g
        };
        d.playlist.filterPlaylist = function(h, g) {
            var f = [];
            c.each(h,
            function(k) {
                k = b.extend({},
                k);
                k.sources = e(k.sources, false, g);
                if (!k.sources.length) {
                    return
                }
                for (var i = 0; i < k.sources.length; i++) {
                    k.sources[i].label = k.sources[i].label || i.toString()
                }
                f.push(k)
            });
            return f
        };
        function a(h) {
            if (!h || !h.file) {
                return
            }
            var f = b.trim("" + h.file);
            var g = h.type;
            if (!g) {
                var i = b.extension(f);
                g = b.extensionmap.extType(i)
            }
            return b.extend({},
            h, {
                file: f,
                type: g
            })
        }
        var e = d.playlist.filterSources = function(g, i, j) {
            var h, k = [],
            f = (i ? d.embed.flashCanPlay: d.embed.html5CanPlay);
            if (!g) {
                return
            }
            c.each(g,
            function(l) {
                var m = a(l);
                if (!m) {
                    return
                }
                if (f(m.file, m.type, j)) {
                    h = h || m.type;
                    if (m.type === h) {
                        k.push(m)
                    }
                }
            });
            return k
        }
    })(jwplayer); (function(b) {
        var a = b.item = function(f) {
            var c = jwplayer.utils,
            e = c.extend({},
            a.defaults, f),
            g,
            d,
            h;
            e.tracks = (f && c.exists(f.tracks)) ? f.tracks: [];
            if (e.sources.length === 0) {
                e.sources = [new b.source(e)]
            }
            for (g = 0; g < e.sources.length; g++) {
                h = e.sources[g]["default"];
                if (h) {
                    e.sources[g]["default"] = (h.toString() === "true")
                } else {
                    e.sources[g]["default"] = false
                }
                e.sources[g] = new b.source(e.sources[g])
            }
            if (e.captions && !c.exists(f.tracks)) {
                for (d = 0; d < e.captions.length; d++) {
                    e.tracks.push(e.captions[d])
                }
                delete e.captions
            }
            for (g = 0; g < e.tracks.length; g++) {
                e.tracks[g] = new b.track(e.tracks[g])
            }
            return e
        };
        a.defaults = {
            description: undefined,
            image: undefined,
            mediaid: undefined,
            title: undefined,
            sources: [],
            tracks: []
        }
    })(jwplayer.playlist); (function(b) {
        var a = b.utils,
        d = b.events,
        c = b.parsers;
        b.playlist.loader = function() {
            var g = new d.eventdispatcher();
            a.extend(this, g);
            this.load = function(i) {
                a.ajax(i, h, f)
            };
            function h(l) {
                try {
                    var n = l.responseXML.childNodes;
                    var o = "";
                    for (var j = 0; j < n.length; j++) {
                        o = n[j];
                        if (o.nodeType !== 8) {
                            break
                        }
                    }
                    if (c.localName(o) === "xml") {
                        o = o.nextSibling
                    }
                    if (c.localName(o) !== "rss") {
                        e("Not a valid RSS feed");
                        return
                    }
                    var k = new b.playlist(c.rssparser.parse(o));
                    g.sendEvent(d.JWPLAYER_PLAYLIST_LOADED, {
                        playlist: k
                    })
                } catch(m) {
                    e()
                }
            }
            function f(i) {
                e(i.match(/invalid/i) ? "Not a valid RSS feed": "")
            }
            function e(i) {
                g.sendEvent(d.JWPLAYER_ERROR, {
                    message: i ? i: "Error loading file"
                })
            }
        }
    })(jwplayer); (function(c) {
        var a = jwplayer.utils,
        b = {
            file: undefined,
            label: undefined,
            type: undefined,
            "default": undefined
        };
        c.source = function(e) {
            var d = a.extend({},
            b);
            a.foreach(b,
            function(f) {
                if (a.exists(e[f])) {
                    d[f] = e[f];
                    delete e[f]
                }
            });
            if (d.type && d.type.indexOf("/") > 0) {
                d.type = a.extensionmap.mimeType(d.type)
            }
            if (d.type === "m3u8") {
                d.type = "hls"
            }
            if (d.type === "smil") {
                d.type = "rtmp"
            }
            return d
        }
    })(jwplayer.playlist); (function(c) {
        var a = jwplayer.utils,
        b = {
            file: undefined,
            label: undefined,
            kind: "captions",
            "default": false
        };
        c.track = function(d) {
            var e = a.extend({},
            b);
            if (!d) {
                d = {}
            }
            a.foreach(b,
            function(f) {
                if (a.exists(d[f])) {
                    e[f] = d[f];
                    delete d[f]
                }
            });
            return e
        }
    })(jwplayer.playlist); (function(e) {
        var c = e.utils,
        f = e.events,
        d = e._;
        var h = e.embed = function(s) {
            var m = new h.config(s.config),
            k = m.width,
            A = m.height,
            j = "Error loading player: ",
            u = document.getElementById(s.id),
            B = e.plugins.loadPlugins(s.id, m.plugins),
            x,
            q = false,
            y = false,
            w = null,
            t = -1,
            v = this;
            m.id = s.id;
            if (m.aspectratio) {
                s.config.aspectratio = m.aspectratio
            } else {
                delete s.config.aspectratio
            }
            g(s, m.events);
            var n = document.createElement("div");
            n.id = u.id;
            n.style.width = k.toString().indexOf("%") > 0 ? k: (k + "px");
            n.style.height = A.toString().indexOf("%") > 0 ? A: (A + "px");
            v.embed = function() {
                if (y) {
                    return
                }
                B.addEventListener(f.COMPLETE, p);
                B.addEventListener(f.ERROR, o);
                B.load()
            };
            v.destroy = function() {
                if (w) {
                    w.destroy();
                    w = null
                }
                if (B) {
                    B.destroy();
                    B = null
                }
                if (x) {
                    x.resetEventListeners();
                    x = null
                }
            };
            function p() {
                if (y) {
                    return
                }
                var H = m.playlist;
                if (d.isArray(H)) {
                    if (H.length === 0) {
                        r();
                        return
                    }
                    if (H.length === 1) {
                        if (!H[0].sources || H[0].sources.length === 0 || !H[0].sources[0].file) {
                            r();
                            return
                        }
                    }
                }
                if (q) {
                    return
                }
                if (d.isString(H)) {
                    x = new e.playlist.loader();
                    x.addEventListener(f.JWPLAYER_PLAYLIST_LOADED,
                    function(J) {
                        m.playlist = J.playlist;
                        q = false;
                        p()
                    });
                    x.addEventListener(f.JWPLAYER_ERROR,
                    function(J) {
                        q = false;
                        r(J)
                    });
                    q = true;
                    x.load(m.playlist);
                    return
                }
                if (B.getStatus() === c.loaderstatus.COMPLETE) {
                    for (var D = 0; D < m.modes.length; D++) {
                        var G = m.modes[D];
                        var E = G.type;
                        if (E && h[E]) {
                            var C = c.extend({},
                            m);
                            w = new h[E](n, G, C, B, s);
                            if (w.supportsConfig()) {
                                w.addEventListener(f.ERROR, i);
                                w.embed();
                                a();
                                return s
                            }
                        }
                    }
                    var F;
                    var I = '<img src="/static/lib/jwplayer/1.0.0/flasherror.png" width="380" height="280" usemap="#Map" border="0" /><map name="Map" id="Map"><area shape="rect" coords="215,240,374,278" href="http://www.imooc.com/user/feedback" target="_blank" /><area shape="rect" coords="6,239,165,277" href="http://get.adobe.com/cn/flashplayer/" target="_blank" /></map>';
                    if (m.fallback) {
                        F = m.fallbackMessage || I;
                        t = setTimeout(function() {
                            l(F, true)
                        },
                        10);
                        c.log(F);
                        r({
                            message: F
                        })
                    } else {
                        F = m.fallbackMessage || I;
                        l(F, false);
                        c.log(F)
                    }
                }
            }
            function i(C) {
                z(j + C.message)
            }
            function o(C) {
                s.dispatchEvent(f.JWPLAYER_ERROR, {
                    message: "Could not load plugin: " + C.message
                })
            }
            function r(C) {
                if (C && C.message) {
                    z(C.message)
                } else {
                    z(j + "No playable sources found")
                }
            }
            function l(C, D) {
                clearTimeout(t);
                t = setTimeout(function() {
                    s.dispatchEvent(f.JWPLAYER_SETUP_ERROR, {
                        message: C,
                        fallback: D
                    })
                },
                0)
            }
            function z(C) {
                if (y) {
                    return
                }
                u.parentNode.replaceChild(n, u);
                if (!m.fallback) {
                    l(C, false);
                    return
                }
                y = true;
                b(n, C, m);
                l(C, true)
            }
            v.errorScreen = z;
            return v
        };
        function g(j, i) {
            c.foreach(i,
            function(k, m) {
                var l = j[k];
                if (typeof l === "function") {
                    l.call(j, m)
                }
            })
        }
        function a() {
            c.css("object.jwswf, .jwplayer:focus", {
                outline: "none"
            });
            c.css(".jw-tab-focus:focus", {
                outline: "solid 2px #0B7EF4"
            })
        }
        function b(i, l, j) {
            var k = i.style;
            k.backgroundColor = "#000";
            k.color = "#FFF";
            k.width = c.styleDimension(j.width);
            k.height = c.styleDimension(j.height);
            k.display = "table";
            k.opacity = 1;
            var n = document.createElement("p"),
            m = n.style;
            m.verticalAlign = "middle";
            m.textAlign = "center";
            m.display = "table-cell";
            m.font = "15px/20px Arial, Helvetica, sans-serif";
            n.innerHTML = l.replace(":", ":<br>");
            i.innerHTML = "";
            i.appendChild(n)
        }
        e.embed.errorScreen = b
    })(jwplayer); (function(e) {
        var h = e.utils,
        g = e.embed,
        i = e.playlist.item;
        var a = g.config = function(k) {
            var m = {
                fallback: true,
                height: 270,
                primary: "html5",
                width: 480,
                base: k.base ? k.base: h.getScriptPath("jwplayer.js"),
                aspectratio: ""
            },
            l = h.extend({},
            m, e.defaults, k),
            j = {
                html5: {
                    type: "html5",
                    src: l.base + "jwplayer.html5.js"
                },
                flash: {
                    type: "flash",
                    src: l.base + "jwplayer.flash.swf"
                }
            };
            l.modes = (l.primary === "flash") ? [j.flash, j.html5] : [j.html5, j.flash];
            if (l.listbar) {
                l.playlistsize = l.listbar.size;
                l.playlistposition = l.listbar.position;
                l.playlistlayout = l.listbar.layout
            }
            if (l.flashplayer) {
                j.flash.src = l.flashplayer
            }
            if (l.html5player) {
                j.html5.src = l.html5player
            }
            d(l);
            f(l);
            return l
        };
        function f(k) {
            var j = k.aspectratio,
            l = b(j);
            if (k.width.toString().indexOf("%") === -1) {
                delete k.aspectratio
            } else {
                if (!l) {
                    delete k.aspectratio
                } else {
                    k.aspectratio = l
                }
            }
        }
        function b(k) {
            if (typeof k !== "string" || !h.exists(k)) {
                return 0
            }
            var l = k.indexOf(":");
            if (l === -1) {
                return 0
            }
            var j = parseFloat(k.substr(0, l)),
            m = parseFloat(k.substr(l + 1));
            if (j <= 0 || m <= 0) {
                return 0
            }
            return (m / j * 100) + "%"
        }
        a.addConfig = function(j, k) {
            d(k);
            return h.extend(j, k)
        };
        function d(k) {
            if (!k.playlist) {
                var m = {};
                h.foreach(i.defaults,
                function(n) {
                    c(k, m, n)
                });
                if (!m.sources) {
                    if (k.levels) {
                        m.sources = k.levels;
                        delete k.levels
                    } else {
                        var j = {};
                        c(k, j, "file");
                        c(k, j, "type");
                        m.sources = j.file ? [j] : []
                    }
                }
                k.playlist = [new i(m)]
            } else {
                for (var l = 0; l < k.playlist.length; l++) {
                    k.playlist[l] = new i(k.playlist[l])
                }
            }
        }
        function c(l, j, k) {
            if (h.exists(l[k])) {
                j[k] = l[k];
                delete l[k]
            }
        }
    })(jwplayer); (function(d) {
        var h = d.embed,
        i = d.utils,
        c = "none",
        a = "block",
        f = "100%",
        e = "relative",
        b = "absolute";
        function g(j, l) {
            var m = document.querySelectorAll(j);
            function n(p, o) {
                m[k].style[p] = o
            }
            for (var k = 0; k < m.length; k++) {
                i.foreach(l, n)
            }
        }
        h.download = function(m, w, k) {
            var p = i.extend({},
            w),
            t,
            n = p.width ? p.width: 480,
            q = p.height ? p.height: 320,
            x,
            r,
            j = w.logo ? w.logo: {
                prefix: i.repo(),
                file: "logo.png",
                margin: 10
            };
            function v() {
                var C, D, B, E, I, z, y, H, A = p.playlist,
                F = ["mp4", "aac", "mp3"];
                if (!A || !A.length) {
                    return
                }
                I = A[0];
                z = I.sources;
                for (E = 0; E < z.length; E++) {
                    y = z[E];
                    if (!y.file) {
                        continue
                    }
                    H = y.type || i.extensionmap.extType(i.extension(y.file));
                    var G = i.indexOf(F, H);
                    if (G >= 0) {
                        C = y.file;
                        D = I.image
                    } else {
                        if (i.isYouTube(y.file, H)) {
                            B = y.file
                        }
                    }
                }
                if (C) {
                    x = C;
                    r = D;
                    s();
                    o()
                } else {
                    if (B) {
                        l(B)
                    } else {
                        k()
                    }
                }
            }
            function s() {
                if (m) {
                    t = u("a", "display", m);
                    u("div", "icon", t);
                    u("div", "logo", t);
                    if (x) {
                        t.setAttribute("href", i.getAbsolutePath(x))
                    }
                }
            }
            function o() {
                var y = "#" + m.id + " .jwdownload";
                m.style.width = "";
                m.style.height = "";
                g(y + "display", {
                    width: i.styleDimension(Math.max(320, n)),
                    height: i.styleDimension(Math.max(180, q)),
                    background: "black center no-repeat " + (r ? "url(" + r + ")": ""),
                    backgroundSize: "contain",
                    position: e,
                    border: c,
                    display: a
                });
                g(y + "display div", {
                    position: b,
                    width: f,
                    height: f
                });
                g(y + "logo", {
                    top: j.margin + "px",
                    right: j.margin + "px",
                    background: "top right no-repeat url(" + j.prefix + j.file + ")"
                });
                g(y + "icon", {
                    background: "center no-repeat url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADwAAAA8CAYAAAA6/NlyAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAgNJREFUeNrs28lqwkAYB/CZqNVDDj2r6FN41QeIy8Fe+gj6BL275Q08u9FbT8ZdwVfotSBYEPUkxFOoks4EKiJdaDuTjMn3wWBO0V/+sySR8SNSqVRKIR8qaXHkzlqS9jCfzzWcTCYp9hF5o+59sVjsiRzcegSckFzcjT+ruN80TeSlAjCAAXzdJSGPFXRpAAMYwACGZQkSdhG4WCzehMNhqV6vG6vVSrirKVEw66YoSqDb7cqlUilE8JjHd/y1MQefVzqdDmiaJpfLZWHgXMHn8F6vJ1cqlVAkEsGuAn83J4gAd2RZymQygX6/L1erVQt+9ZPWb+CDwcCC2zXGJaewl/DhcHhK3DVj+KfKZrMWvFarcYNLomAv4aPRSFZVlTlcSPA5fDweW/BoNIqFnKV53JvncjkLns/n/cLdS+92O7RYLLgsKfv9/t8XlDn4eDyiw+HA9Jyz2eyt0+kY2+3WFC5hluej0Ha7zQQq9PPwdDq1Et1sNsx/nFBgCqWJ8oAK1aUptNVqcYWewE4nahfU0YQnk4ntUEfGMIU2m01HoLaCKbTRaDgKtaVLk9tBYaBcE/6Artdr4RZ5TB6/dC+9iIe/WgAMYADDpAUJAxjAAAYwgGFZgoS/AtNNTF7Z2bL0BYPBV3Jw5xFwwWcYxgtBP5OkE8i9G7aWGOOCruvauwADALMLMEbKf4SdAAAAAElFTkSuQmCC)"
                })
            }
            function u(y, B, A) {
                var z = document.createElement(y);
                if (B) {
                    z.className = "jwdownload" + B
                }
                if (A) {
                    A.appendChild(z)
                }
                return z
            }
            function l(y) {
                var z = u("iframe", "", m);
                z.src = "http://www.youtube.com/embed/" + i.youTubeID(y);
                z.width = n;
                z.height = q;
                z.style.border = "none"
            }
            v()
        }
    })(jwplayer); (function(c) {
        var b = c.utils,
        d = c.events,
        a = {};
        var f = c.embed.flash = function(k, l, o, j, m) {
            var h = new c.events.eventdispatcher(),
            i = b.flashVersion();
            b.extend(this, h);
            function p(r, q, s) {
                var t = document.createElement("param");
                t.setAttribute("name", q);
                t.setAttribute("value", s);
                r.appendChild(t)
            }
            function n(r, s, q) {
                return function() {
                    try {
                        if (q) {
                            document.getElementById(m.id + "_wrapper").appendChild(s)
                        }
                        var u = document.getElementById(m.id).getPluginConfig("display");
                        if (typeof r.resize === "function") {
                            r.resize(u.width, u.height)
                        }
                        s.style.left = u.x;
                        s.style.top = u.h
                    } catch(t) {}
                }
            }
            function g(q) {
                if (!q) {
                    return {}
                }
                var s = {},
                r = [];
                b.foreach(q,
                function(t, v) {
                    var u = b.getPluginName(t);
                    r.push(t);
                    b.foreach(v,
                    function(x, w) {
                        s[u + "." + x] = w
                    })
                });
                s.plugins = r.join(",");
                return s
            }
            this.embed = function() {
                o.id = m.id;
                if (i < 10) {
                    h.sendEvent(d.ERROR, {
                        message: "Flash version must be 10.0 or greater"
                    });
                    return false
                }
                var E, B, r = k.id,
                u = m.config.listbar;
                var y = b.extend({},
                o);
                var v = document.getElementById(m.id);
                v.parentNode.replaceChild(k, v);
                if (r + "_wrapper" === k.parentNode.id) {
                    E = document.getElementById(r + "_wrapper")
                } else {
                    E = document.createElement("div");
                    B = document.createElement("div");
                    B.style.display = "none";
                    B.id = r + "_aspect";
                    E.id = r + "_wrapper";
                    E.style.position = "relative";
                    E.style.display = "block";
                    E.style.width = b.styleDimension(y.width);
                    E.style.height = b.styleDimension(y.height);
                    if (m.config.aspectratio) {
                        var w = parseFloat(m.config.aspectratio);
                        B.style.display = "block";
                        B.style.marginTop = m.config.aspectratio;
                        E.style.height = "auto";
                        E.style.display = "inline-block";
                        if (u) {
                            if (u.position === "bottom") {
                                B.style.paddingBottom = u.size + "px"
                            } else {
                                if (u.position === "right") {
                                    B.style.marginBottom = ( - 1 * u.size * (w / 100)) + "px"
                                }
                            }
                        }
                    }
                    k.parentNode.replaceChild(E, k);
                    E.appendChild(k);
                    E.appendChild(B)
                }
                var s = j.setupPlugins(m, y, n);
                if (s.length > 0) {
                    b.extend(y, g(s.plugins))
                } else {
                    delete y.plugins
                }
                if (typeof y["dock.position"] !== "undefined") {
                    if (y["dock.position"].toString().toLowerCase() === "false") {
                        y.dock = y["dock.position"];
                        delete y["dock.position"]
                    }
                }
                var D = "#000000",
                A, t = y.wmode || (y.height && y.height <= 80 ? "transparent": "opaque"),
                x = ["height", "width", "modes", "events", "primary", "base", "fallback", "volume"];
                for (var z = 0; z < x.length; z++) {
                    delete y[x[z]]
                }
                var C = b.getCookies();
                b.foreach(C,
                function(F, G) {
                    if (typeof(y[F]) === "undefined") {
                        y[F] = G
                    }
                });
                var q = window.location.href.split("/");
                q.splice(q.length - 1, 1);
                q = q.join("/");
                y.base = q + "/";
                a[r] = y;
                if (b.isMSIE()) {
                    k.outerHTML = '<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" width="100%" height="100%" id="' + r + '" name="' + r + '" tabindex="0"><param name="movie" value="' + l.src + '"><param name="allowfullscreen" value="true"><param name="allowscriptaccess" value="always"><param name="seamlesstabbing" value="true"><param name="wmode" value="' + t + '"><param name="bgcolor" value="' + D + '"></object>';
                    A = E.getElementsByTagName("object")[0];
                    A.style.outline = "none"
                } else {
                    A = document.createElement("object");
                    A.setAttribute("type", "application/x-shockwave-flash");
                    A.setAttribute("data", l.src);
                    A.setAttribute("width", "100%");
                    A.setAttribute("height", "100%");
                    A.setAttribute("bgcolor", D);
                    A.setAttribute("id", r);
                    A.setAttribute("name", r);
                    A.className = "jwswf";
                    p(A, "allowfullscreen", "true");
                    p(A, "allowscriptaccess", "always");
                    p(A, "seamlesstabbing", "true");
                    p(A, "wmode", t);
                    k.parentNode.replaceChild(A, k)
                }
                if (m.config.aspectratio) {
                    A.style.position = "absolute";
                    A.style.left = "0"
                }
                m.container = A;
                m.setPlayer(A, "flash")
            };
            this.supportsConfig = function() {
                if (i) {
                    if (o) {
                        if (b.typeOf(o.playlist) === "string") {
                            return true
                        }
                        try {
                            var s = o.playlist[0],
                            q = s.sources;
                            if (typeof q === "undefined") {
                                return true
                            } else {
                                for (var r = 0; r < q.length; r++) {
                                    if (q[r].file && e(q[r].file, q[r].type)) {
                                        return true
                                    }
                                }
                            }
                        } catch(t) {
                            return false
                        }
                    } else {
                        return true
                    }
                }
                return false
            };
            this.destroy = function() {}
        };
        f.getVars = function(g) {
            return a[g]
        };
        var e = c.embed.flashCanPlay = function(g, h) {
            if (b.isYouTube(g, h)) {
                return true
            }
            if (b.isRtmp(g, h)) {
                return true
            }
            if (h === "hls") {
                return true
            }
            var i = b.extensionmap[h ? h: b.extension(g)];
            if (!i) {
                return false
            }
            return !! (i.flash)
        }
    })(jwplayer); (function(c) {
        var a = c.utils,
        b = a.extensionmap,
        d = c.events,
        g;
        c.embed.html5 = function(i, n, h, j, l) {
            var o = this,
            m = new d.eventdispatcher();
            a.extend(o, m);
            function k(q, r, p) {
                return function() {
                    try {
                        var s = document.querySelector("#" + i.id + " .jwmain");
                        if (p) {
                            s.appendChild(r)
                        }
                        if (typeof q.resize === "function") {
                            q.resize(s.clientWidth, s.clientHeight);
                            setTimeout(function() {
                                q.resize(s.clientWidth, s.clientHeight)
                            },
                            400)
                        }
                        r.left = s.style.left;
                        r.top = s.style.top
                    } catch(t) {}
                }
            }
            o.embed = function() {
                if (!c.html5) {
                    this.loadEmbedder();
                    return
                }
                j.setupPlugins(l, h, k);
                a.emptyElement(i);
                var p = c.utils.extend({},
                h);
                delete p.volume;
                var q = new c.html5.player(p);
                l.setPlayer(q, "html5")
            };
            this.loadEmbedder = function() {
                g = g || new a.scriptloader(n.src);
                g.addEventListener(d.ERROR, this.loadError);
                g.addEventListener(d.COMPLETE, this.embed);
                g.load()
            };
            this.loadError = function(p) {
                this.sendEvent(p.type, {
                    message: "HTML5 player not found"
                })
            };
            o.supportsConfig = function() {
                if ( !! c.vid.canPlayType) {
                    try {
                        if (a.typeOf(h.playlist) === "string") {
                            return true
                        } else {
                            var p = h.playlist[0].sources;
                            for (var r = 0; r < p.length; r++) {
                                var q = p[r].file,
                                s = p[r].type;
                                if (c.embed.html5CanPlay(q, s, h.androidhls)) {
                                    return true
                                }
                            }
                        }
                    } catch(t) {}
                }
                return false
            };
            o.destroy = function() {
                if (g) {
                    g.resetEventListeners();
                    g = null
                }
            }
        };
        function f(h, i, k) {
            if (navigator.userAgent.match(/BlackBerry/i) !== null) {
                return false
            }
            if (a.isIE(9)) {
                return false
            }
            if (a.isYouTube(h, i)) {
                return true
            }
            var m = a.extension(h);
            i = i || b.extType(m);
            if (i === "hls") {
                if (k) {
                    var l = a.isAndroidNative;
                    if (l(2) || l(3) || l("4.0")) {
                        return false
                    } else {
                        if (a.isAndroid()) {
                            return true
                        }
                    }
                } else {
                    if (a.isAndroid()) {
                        return false
                    }
                }
            }
            if (a.isRtmp(h, i)) {
                return false
            }
            var j = b[i] || b[m];
            if (!j) {
                return false
            }
            if (j.flash && !j.html5) {
                return false
            }
            return e(j.html5)
        }
        function e(i) {
            if (!i) {
                return true
            }
            try {
                var h = c.vid.canPlayType(i);
                return !! h
            } catch(j) {}
            return false
        }
        c.embed.html5CanPlay = f
    })(jwplayer); (function(f, e) {
        var b = [],
        k = f.utils,
        m = f.events,
        l = f._,
        i = 0,
        n = m.state;
        function j(o) {
            k.addClass(o, "jw-tab-focus")
        }
        function d(o) {
            k.removeClass(o, "jw-tab-focus")
        }
        var c = ["getBuffer", "getCaptionsList", "getControls", "getCurrentCaptions", "getCurrentQuality", "getCurrentAudioTrack", "getDuration", "getFullscreen", "getHeight", "getLockState", "getMute", "getPlaylistIndex", "getSafeRegion", "getPosition", "getQualityLevels", "getState", "getVolume", "getWidth", "isBeforeComplete", "isBeforePlay", "releaseState"];
        var h = ["playlistNext", "stop", "forceState", "playlistPrev", "seek", "setCurrentCaptions", "setControls", "setCurrentQuality", "setVolume", "setCurrentAudioTrack"];
        var g = {
            onBufferChange: m.JWPLAYER_MEDIA_BUFFER,
            onBufferFull: m.JWPLAYER_MEDIA_BUFFER_FULL,
            onError: m.JWPLAYER_ERROR,
            onSetupError: m.JWPLAYER_SETUP_ERROR,
            onFullscreen: m.JWPLAYER_FULLSCREEN,
            onMeta: m.JWPLAYER_MEDIA_META,
            onMute: m.JWPLAYER_MEDIA_MUTE,
            onPlaylist: m.JWPLAYER_PLAYLIST_LOADED,
            onPlaylistItem: m.JWPLAYER_PLAYLIST_ITEM,
            onPlaylistComplete: m.JWPLAYER_PLAYLIST_COMPLETE,
            onReady: m.API_READY,
            onResize: m.JWPLAYER_RESIZE,
            onComplete: m.JWPLAYER_MEDIA_COMPLETE,
            onSeek: m.JWPLAYER_MEDIA_SEEK,
            onTime: m.JWPLAYER_MEDIA_TIME,
            onVolume: m.JWPLAYER_MEDIA_VOLUME,
            onBeforePlay: m.JWPLAYER_MEDIA_BEFOREPLAY,
            onBeforeComplete: m.JWPLAYER_MEDIA_BEFORECOMPLETE,
            onDisplayClick: m.JWPLAYER_DISPLAY_CLICK,
            onControls: m.JWPLAYER_CONTROLS,
            onQualityLevels: m.JWPLAYER_MEDIA_LEVELS,
            onQualityChange: m.JWPLAYER_MEDIA_LEVEL_CHANGED,
            onCaptionsList: m.JWPLAYER_CAPTIONS_LIST,
            onCaptionsChange: m.JWPLAYER_CAPTIONS_CHANGED,
            onAdError: m.JWPLAYER_AD_ERROR,
            onAdClick: m.JWPLAYER_AD_CLICK,
            onAdImpression: m.JWPLAYER_AD_IMPRESSION,
            onAdTime: m.JWPLAYER_AD_TIME,
            onAdComplete: m.JWPLAYER_AD_COMPLETE,
            onAdCompanions: m.JWPLAYER_AD_COMPANIONS,
            onAdSkipped: m.JWPLAYER_AD_SKIPPED,
            onAdPlay: m.JWPLAYER_AD_PLAY,
            onAdPause: m.JWPLAYER_AD_PAUSE,
            onAdMeta: m.JWPLAYER_AD_META,
            onCast: m.JWPLAYER_CAST_SESSION,
            onAudioTrackChange: m.JWPLAYER_AUDIO_TRACK_CHANGED,
            onAudioTracks: m.JWPLAYER_AUDIO_TRACKS
        };
        var a = {
            onBuffer: n.BUFFERING,
            onPause: n.PAUSED,
            onPlay: n.PLAYING,
            onIdle: n.IDLE
        };
        f.api = function(G) {
            var K = this,
            o = {},
            y = {},
            q, Q = false,
            D = [],
            N,
            F = {},
            B = {};
            K.container = G;
            K.id = G.id;
            K.setup = function(T) {
                if (f.embed) {
                    f.api.destroyPlayer(K.id);
                    var U = (new f.api(K.container));
                    f.api.addPlayer(U);
                    U.config = T;
                    U._embedder = new f.embed(U);
                    U._embedder.embed();
                    return U
                }
                return K
            };
            K.getContainer = function() {
                return K.container
            };
            K.addButton = function(V, T, U, Y) {
                try {
                    B[Y] = U;
                    var X = 'jwplayer("' + K.id + '").callback("' + Y + '")';
                    J("jwDockAddButton", V, T, X, Y)
                } catch(W) {
                    k.log("Could not add dock button" + W.message)
                }
            };
            K.removeButton = function(T) {
                J("jwDockRemoveButton", T)
            };
            K.callback = function(T) {
                if (B[T]) {
                    B[T]()
                }
            };
            K.setAutoPlay = function(T) {
                k.saveCookies("playAuto", T)
            };
            K.onSpeedChange = function() {};
            K.hideControlBar = function() {
                if (K.renderingMode === "html5") {
                    window.controlbar_jw.hide()
                } else {
                    J("jwControlbarHide")
                }
            };
            K.showControlBar = function() {
                if (K.renderingMode === "html5") {
                    window.controlbar_jw.show()
                } else {
                    J("jwControlbarShow")
                }
            };
            var H = true;
            K.showErrorWin = function() {
                H = false;
                if (K.renderingMode === "html5") {
                    r()
                } else {
                    J("flash_showErrorWin")
                }
            };
            K.hideErrorWin = function() {
                if (H) {
                    return
                }
                if (K.renderingMode === "html5") {
                    z.innerHTML = "";
                    z.style.visibility = "hidden"
                } else {
                    J("flash_hideErrorWin")
                }
            };
            var z = document.createElement("div");
            var P, R, M, L, x, t, A;
            function r() {
                z.innerHTML = "";
                z.zIndex = "9999";
                z.style.background = "#000000";
                z.style.display = "block";
                z.style.visibility = "visible";
                z.style.position = "absolute";
                var U, Y;
                if (K.getWidth() == "100%") {
                    U = document.documentElement.clientHeight || document.body.clientHeight;
                    Y = document.documentElement.clientWidth || document.body.clientWidth
                } else {
                    Y = K.getWidth();
                    U = K.getHeight()
                }
                z.style.width = Y + "px";
                z.style.height = U + "px";
                var V = document.createElement("div");
                V.id = "errorDiv";
                V.style.position = "absolute";
                V.style.width = "400px";
                V.style.height = "200px";
                var X = Y / 2 - 200;
                var W = U / 2 - 100;
                V.style.marginLeft = Y / 2 - 200 + "px";
                V.style.marginTop = U / 2 - 100 + "px";
                P = new Image();
                P.src = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAIdElEQVR4nOWbXWwU1xXHf/fO2hvjtZfdNQ4fAcSHCQgJtRWVoJF4adoG+tDkgVQiRaSoKQUJKFXSoOY9DaFpColQUaMWRMNDKiVKGwxEfUkUkZZErUpVYcCUGoMBy7Pr9Qd48c49fcBrz+yOjfHODDT9Syv7/ufOvf97du+dueeeowgZV9I8UgurLVgGLEWxBJgJJC1FAsARBoA8cB3hPNDmwNnb8OkjWa6EqU+F0WhXkpXxGjYgrLMUj1bTliOcQ9FaGObo7DyfB6WxhMAMcCFN43TNFi1831IsC6pdNxzhrFH8rtdwsCVLXxBtVm2AjiSphMVOpdihFakgRN0NRsiJsH/AYd/8PLlq2qrGANpOs0kp9mpFZrxKRjACf0fxMYZ/OsKFotB5S9G7KEce4GKKZJ0wPaaYqzWLlWIFwhoFX9YKPUHbtggvZLIcBsxUBjElA3Q20jKthkOW4mvjCCsaOCGGt28aTk71W+pIkpqm+ZbSbNCwVitifvUc4dTNYTbN7aP9Xvu4ZwN0p3naUrxlKRrKrxkhJ4o38rc4sHCQG/fa9kT4dz0PJ+vYpoTtflPNEfod4QfNWd65l3bvxQDaTrPX0vykonMYwvBKFl4PanEaDxfSNKZhF5rdFjxUocXwy0yWF5jilPBFK8TtNEd7m5Dyj91Ea0eShYF1Nkl0JFloN9HqqynN0VaIB9JRK8TtDCfKO8lmKPRk2AHjL1IRQPdk2J7NUKgwQoYTkzHC3aaA7slwJKbY4CYd4dpt+M4sm8+qkh8QrmX4ai28bylmufmicLTJZiNTnQ49Gfb4WPZc13TmByE8SHSlmGdnaPOZDq9OdN+4v4DuNOtrtXdFdYQLfUOsWTDI9akKvZFiRdziH37XhuF7M3p4e6ptX6pnZuNDfGTd2W+M4rbhu+M9HXzn7+Uki2KKt9ycI1wdEr5ezeDDxoJBrg8JjzvCVTcfU/zmcpJFfvf4GUDX13BYKxpLhBGGC0WenJOlM2DNgWNOls5CkSeNMFzitKKxvobD+Iy3grDTbLLgMTdn4PkwdmJhYXaezw087+YseKw7zbPldT0G6EiSUtq7aDiGY002+0NRGiKabPY7hmNuLqbZ05H0vkV6DJCw2KmhqVR2hMEh2Bqu1PAwBFsdYbBU1tCUsNjprjNqgDZoUIodnhaEPf8L8348zMnSKfCKm1OKHRfSY+vbqAEyTfzIvckwQm8W9kUjNTzkhP1G6C2VtSI1XbNltFz6a8EP3TeKsC/sjU0UaMnSJ8q7hlmwhZGxa4AbKVZrWFyqYIRi7jYHIlUaIvK3OGCEYqmsYdGNFKtH/oeYZr37BgPHFw/QHa3M8LBwkBsGjru5mOZpGJsCT7gvGuH3EWmLDEY4UkY9AaCvppnrdl0boZiHE5GqiwDZLCfcb4eWYklXinm6Bla5Kwp89kVY/MqxFPoF7/Y9plitteJLnpqKv0SqLEoo/uouasUKrfAeYhiHc9Gqig7lY1OwTCu8zg0RzkYrKzqUj03BfC2UuZGgI1pZ0cFnbE0avP79W2rstTEMDBcZmuByf5h9D+qKA5qELh1Rl1A6rgoL2qIw7kUnQF++D3yebg2Ru7TzDgPjXRPCNb6fm1yPBCeM4mKKZJgilvVjG/H/ph2FHWbfixoqjvP6NWXzrk6YHqYIABRZP3qo4M8HhaSuMMCAVnDNzcSIxOd/tZwwUAjb46wVc8uoHi1ljwYVUnSHG2Iq435Ewn/8lo9NoEML3pcDbVUX0zMZiOKyD/2fsPvVZQcmAme1Ec7gZT2bozAgiksVpL9RgoXyjs0IZ3RR+NRbh5VtVAY/BAkjXCznRML9BbRBg4KVbq5oRjZ+doZz7gPF7rTXQ/RFQHea9WWHvOdhzCPkcYBoxcbIFYYMnzEdhxEDOIY/eCrD2vYEzRFpCx3tCZo1rHVzpTFrgOYcpwxj81IrYqlatkUrMzykatnmjjAzcLE5xykYmwLGgYPum5RiR1iL4ZUGltgZ3rUz9I183r3S4H1EBQW/E6+RsRpwnQz1Gg6Wn6DMSLMraEFdGZZOq+W0pXjKUjSMfJ6aVsvprgxLg+5vRppd5SdevWbsyx41QEuWPpGyozDN7qAjwOLwslaVGy6tSMbh5SD7up5kAZrdbk4U+93bYs92eMBhn4GeUtmCukQNbwQpCnh8gmvfDLKjmhretKCuVDbQ013wHpN5DDA/T65oeNHNWbCuJ8P2IIVFgZ4M2y1Y5+aKhheX9Xu33BUOkeYshxy5s0K6Kr3WlfS+RVWBP09w7cMgOuhKslLDa27OEU41ZzlUXtfPI2RuDrPJiGueKGriMf7U2UhLteIK8JKRSs+PEfIFeKna9jsbaYnH+KNW1Lja7rs5zCZ84gV9XWJz+2gvCs+5OUsxs76W45fqmVmNwNk2Z4dglSO85wgDI5/3hmDVbLs6l/yl+jsafQImn5tKJDl2mr0+gZJtXSnmVSM0DEwQKPmLie77vw+VvZtX2Jy22ewIJ92kpZgVh08ehKdDT4btcfikfPCOcPK0zWaCCJufMFw+zQf3I1z+epIFdpoPqg2XDzJh4udZ+FVECRM70fwsiISJ4FNmhH35Ar8OOmWmPUFzqpatSrHzfqXMjGIySVNAa1E4esvhw2qSpuosvhFTPAOseyCSplzQ3WmejSlenUTa3N8QPhbFGcfQ7kBnLkd2OQy8A7XLG0k0KFJxi4ctRYsSVqBYo+Ard0ubKwo/HXnDiy5tzo2OJKlEDT8eL5srDBgh5yjevDnM6/czcdIDV+rsZksFv68HcIQ2o/jtA5U664euJCvjMTYqxbc1/okKk4WBiyIcKxQ58kAnT48HV/r8cuBRpVgiMBNFyoK6kQVzAEWOO0+R88A5B/4VRfr8fwEECY9cFr55XAAAAABJRU5ErkJggg==";
                P.style.marginTop = 50 + "px";
                P.style.marginLeft = 10 + "px";
                var T = document.getElementById(K.id);
                V.appendChild(P);
                z.appendChild(V);
                T.appendChild(z);
                R = document.createElement("input");
                R.value = "咦？加载失败了！";
                R.style.color = "#ffffff";
                R.style.font = "16px Microsoft YaHei,SimSun,Arial";
                R.style.position = "absolute";
                R.style.marginLeft = 20 + "px";
                R.style.marginTop = 40 + "px";
                R.style.border = "0px solid #000000";
                R.style.background = "#000000";
                V.appendChild(R);
                M = document.createElement("input");
                M.value = "首先联络网络管理员，确认是否屏蔽swf/flv/mp4";
                M.style.color = "#787d82";
                M.style.font = "12px/em Microsoft YaHei,SimSun,Arial";
                M.style.position = "absolute";
                M.style.marginLeft = 20 + "px";
                M.style.marginTop = 75 + "px";
                M.style.width = "300px";
                M.style.border = "0px solid #FFFFFF";
                M.style.background = "#000000";
                V.appendChild(M);
                L = document.createElement("input");
                L.value = "还是无法观看？请查看";
                L.style.color = "#787d82";
                L.style.font = "12px/em Microsoft YaHei,SimSun,Arial";
                L.style.position = "absolute";
                L.style.marginLeft = 20 + "px";
                L.style.marginTop = 100 + "px";
                L.style.border = "0px solid #FFFFFF";
                L.style.background = "#000000";
                V.appendChild(L);
                x = document.createElement("input");
                x.value = "常见问题";
                x.style.color = "#f01400";
                x.style.font = "14px Microsoft YaHei,SimSun,Arial";
                x.style.position = "absolute";
                x.style.marginLeft = 152 + "px";
                x.style.marginTop = 98 + "px";
                x.style.border = "0px solid #ffffff";
                x.style.background = "#000000";
                x.style.cursor = "pointer";
                V.appendChild(x);
                x.onmouseout = function() {
                    this.style.color = "#f01400"
                };
                x.onmouseover = function() {
                    this.style.color = "#ff4d4d"
                };
                x.addEventListener("click", w);
                t = document.createElement("input");
                t.value = "或提�?";
                t.style.color = "#787d82";
                t.style.font = "12px/em Microsoft YaHei,SimSun,Arial";
                t.style.position = "absolute";
                t.style.marginLeft = 209 + "px";
                t.style.marginTop = 101 + "px";
                t.style.width = "50px";
                t.style.border = "0px solid #FFFFFF";
                t.style.background = "#000000";
                V.appendChild(t);
                A = document.createElement("input");
                A.value = "意见反馈";
                A.style.color = "#f01400";
                A.style.font = "14px Microsoft YaHei,SimSun,Arial";
                A.style.position = "absolute";
                A.style.marginLeft = 236 + "px";
                A.style.marginTop = 98 + "px";
                A.style.border = "0px solid #ffffff";
                A.style.background = "#000000";
                A.style.width = "60px";
                A.style.cursor = "pointer";
                V.appendChild(A);
                A.onmouseout = function() {
                    this.style.color = "#f01400"
                };
                A.onmouseover = function() {
                    this.style.color = "#ff4d4d"
                };
                A.addEventListener("click", s)
            }
            function s(T) {
                window.open("http://www.imooc.com/user/feedback")
            }
            function w(T) {
                window.open("http://www.imooc.com/about/faq")
            }
            K.getMeta = function() {
                return K.getItemMeta()
            };
            K.getPlaylist = function() {
                var T = J("jwGetPlaylist");
                if (K.renderingMode === "flash") {
                    k.deepReplaceKeyName(T, ["__dot__", "__spc__", "__dsh__", "__default__"], [".", " ", "-", "default"])
                }
                return T
            };
            K.getPlaylistItem = function(T) {
                if (!k.exists(T)) {
                    T = K.getPlaylistIndex()
                }
                return K.getPlaylist()[T]
            };
            K.getRenderingMode = function() {
                return K.renderingMode
            };
            K.getAutoPlay = function() {
                var T = k.getCookies();
                var U = T.playAuto;
                switch (U) {
                case "undefined":
                case "false":
                case e:
                case false:
                    U = false;
                    break;
                case "true":
                case true:
                    U = true;
                    break
                }
                return U
            };
            K.setFullscreen = function(T) {
                if (!k.exists(T)) {
                    J("jwSetFullscreen", !J("jwGetFullscreen"))
                } else {
                    J("jwSetFullscreen", T)
                }
                return K
            };
            K.setMute = function(T) {
                if (!k.exists(T)) {
                    J("jwSetMute", !J("jwGetMute"))
                } else {
                    J("jwSetMute", T)
                }
                return K
            };
            K.lock = function() {
                return K
            };
            K.unlock = function() {
                return K
            };
            K.load = function(T) {
                this.hideErrorWin();
                J("jwInstreamDestroy");
                if (f(K.id).plugins.googima) {
                    J("jwDestroyGoogima")
                }
                J("jwLoad", T);
                return K
            };
            K.playlistItem = function(T) {
                J("jwPlaylistItem", parseInt(T, 10));
                return K
            };
            K.resize = function(V, T) {
                if (K.renderingMode !== "flash") {
                    J("jwResize", V, T)
                } else {
                    var W = document.getElementById(K.id + "_wrapper"),
                    U = document.getElementById(K.id + "_aspect");
                    if (U) {
                        U.style.display = "none"
                    }
                    if (W) {
                        W.style.display = "block";
                        W.style.width = k.styleDimension(V);
                        W.style.height = k.styleDimension(T)
                    }
                }
                return K
            };
            K.play = function(T) {
                this.hideErrorWin();
                if (T !== e) {
                    J("jwPlay", T);
                    return K
                }
                T = K.getState();
                var U = N && N.getState();
                if (U) {
                    if (U === n.IDLE || U === n.PLAYING || U === n.BUFFERING) {
                        J("jwInstreamPause")
                    } else {
                        J("jwInstreamPlay")
                    }
                }
                if (T === n.PLAYING || T === n.BUFFERING) {
                    J("jwPause")
                } else {
                    J("jwPlay")
                }
                return K
            };
            K.pause = function(T) {
                if (T === e) {
                    T = K.getState();
                    if (T === n.PLAYING || T === n.BUFFERING) {
                        J("jwPause")
                    } else {
                        J("jwPlay")
                    }
                } else {
                    J("jwPause", T)
                }
                return K
            };
            K.play_imooc = function(T) {
                if (T !== e) {
                    J("jwPlay", T);
                    return K
                }
                T = K.getState();
                var U = N && N.getState();
                if (U) {
                    if (U === n.IDLE || U === n.PLAYING || U === n.BUFFERING) {} else {
                        J("jwInstreamPlay")
                    }
                }
                if (T === n.PLAYING || T === n.BUFFERING) {} else {
                    J("jwPlay")
                }
                return K
            };
            K.pause_imooc = function(T) {
                if (T === e) {
                    T = K.getState();
                    if (T === n.PLAYING || T === n.BUFFERING) {
                        J("jwPause")
                    } else {}
                } else {
                    J("jwPause", T)
                }
                return K
            };
            K.createInstream = function() {
                return new f.api.instream(this, q)
            };
            K.setInstream = function(T) {
                N = T;
                return T
            };
            K.loadInstream = function(U, T) {
                N = K.setInstream(K.createInstream()).init(T);
                N.loadItem(U);
                return N
            };
            K.destroyPlayer = function() {
                Q = true;
                J("jwPlayerDestroy")
            };
            K.playAd = function(U) {
                var T = f(K.id).plugins;
                if (T.vast) {
                    T.vast.jwPlayAd(U)
                } else {
                    J("jwPlayAd", U)
                }
            };
            K.pauseAd = function() {
                var T = f(K.id).plugins;
                if (T.vast) {
                    T.vast.jwPauseAd()
                } else {
                    J("jwPauseAd")
                }
            };
            function C(T, U) {
                k.foreach(T,
                function(V, W) {
                    K[V] = function(X) {
                        return U(W, X)
                    }
                })
            }
            C(a, E);
            C(g, O);
            function u(T, U) {
                var V = "jw" + U.charAt(0).toUpperCase() + U.slice(1);
                K[U] = function() {
                    var W = J.apply(this, [V].concat(Array.prototype.slice.call(arguments, 0)));
                    return (T ? K: W)
                }
            }
            var p = function(U, T) {
                u(false, T)
            };
            var I = function(U, T) {
                u(true, T)
            };
            k.foreach(c, p);
            k.foreach(h, I);
            K.remove = function() {
                if (this._embedder && this._embedder.destroy) {
                    this._embedder.destroy()
                }
                D = [];
                var X = (l.size(l.where(b, {
                    id: K.id
                })) > 1);
                if (!X) {
                    k.clearCss("#" + K.id)
                }
                var T = document.getElementById(K.id + (K.renderingMode === "flash" ? "_wrapper": ""));
                if (T) {
                    if (K.renderingMode === "html5") {
                        K.destroyPlayer()
                    } else {
                        if (k.isMSIE(8)) {
                            var W = document.getElementById(K.id);
                            if (W && W.parentNode) {
                                W.style.display = "none";
                                for (var U in W) {
                                    if (typeof W[U] === "function") {
                                        W[U] = null
                                    }
                                }
                                W.parentNode.removeChild(W)
                            }
                        }
                    }
                    if (!X) {
                        var V = document.createElement("div");
                        V.id = K.id;
                        T.parentNode.replaceChild(V, T)
                    }
                }
                b = l.filter(b,
                function(Y) {
                    return (Y.uniqueId !== K.uniqueId)
                })
            };
            K.registerPlugin = function(W, V, U, T) {
                f.plugins.registerPlugin(W, V, U, T)
            };
            K.setPlayer = function(T, U) {
                q = T;
                K.renderingMode = U
            };
            K.detachMedia = function() {
                if (K.renderingMode === "html5") {
                    return J("jwDetachMedia")
                }
            };
            K.attachMedia = function(T) {
                if (K.renderingMode === "html5") {
                    return J("jwAttachMedia", T)
                }
            };
            K.getAudioTracks = function() {
                return J("jwGetAudioTracks")
            };
            function E(T, U) {
                if (!y[T]) {
                    y[T] = [];
                    O(m.JWPLAYER_PLAYER_STATE, S(T))
                }
                y[T].push(U);
                return K
            }
            function S(T) {
                return function(V) {
                    var U = V.newstate,
                    Y = V.oldstate;
                    if (U === T) {
                        var X = y[U];
                        if (X) {
                            for (var Z = 0; Z < X.length; Z++) {
                                var W = X[Z];
                                if (typeof W === "function") {
                                    W.call(this, {
                                        oldstate: Y,
                                        newstate: U
                                    })
                                }
                            }
                        }
                    }
                }
            }
            function v(U, V) {
                try {
                    U.jwAddEventListener(V, 'function(dat) { jwplayer("' + K.id + '").dispatchEvent("' + V + '", dat); }')
                } catch(W) {
                    if (K.renderingMode === "flash") {
                        var T = document.createElement("a");
                        T.href = q.data;
                        if (T.protocol !== location.protocol) {
                            k.log("Warning: Your site [" + location.protocol + "] and JWPlayer [" + T.protocol + "] are hosted using different protocols")
                        }
                    }
                    k.log("Could not add internal listener")
                }
            }
            function O(T, U) {
                if (!o[T]) {
                    o[T] = [];
                    if (q && Q) {
                        v(q, T)
                    }
                }
                o[T].push(U);
                return K
            }
            K.removeEventListener = function(V, W) {
                var U = o[V];
                if (U) {
                    for (var T = U.length; T--;) {
                        if (U[T] === W) {
                            U.splice(T, 1)
                        }
                    }
                }
            };
            K.dispatchEvent = function(X) {
                var W = o[X];
                if (W) {
                    W = W.slice(0);
                    var U = k.translateEventResponse(X, arguments[1]);
                    for (var T = 0; T < W.length; T++) {
                        var V = W[T];
                        if (typeof V === "function") {
                            try {
                                if (X === m.JWPLAYER_PLAYLIST_LOADED) {
                                    k.deepReplaceKeyName(U.playlist, ["__dot__", "__spc__", "__dsh__", "__default__"], [".", " ", "-", "default"])
                                }
                                V.call(this, U)
                            } catch(Y) {
                                k.log("There was an error calling back an event handler", Y)
                            }
                        }
                    }
                }
            };
            K.dispatchInstreamEvent = function(T) {
                if (N) {
                    N.dispatchEvent(T, arguments)
                }
            };
            function J() {
                if (Q) {
                    if (q) {
                        var T = Array.prototype.slice.call(arguments, 0),
                        U = T.shift();
                        if (typeof q[U] === "function") {
                            switch (T.length) {
                            case 6:
                                return q[U](T[0], T[1], T[2], T[3], T[4], T[5]);
                            case 5:
                                return q[U](T[0], T[1], T[2], T[3], T[4]);
                            case 4:
                                return q[U](T[0], T[1], T[2], T[3]);
                            case 3:
                                return q[U](T[0], T[1], T[2]);
                            case 2:
                                return q[U](T[0], T[1]);
                            case 1:
                                return q[U](T[0])
                            }
                            return q[U]()
                        }
                    }
                    return null
                }
                D.push(arguments)
            }
            K.callInternal = J;
            K.playerReady = function(T) {
                Q = true;
                if (!q) {
                    K.setPlayer(document.getElementById(T.id))
                }
                K.container = document.getElementById(K.id);
                k.foreach(o,
                function(U) {
                    v(q, U)
                });
                O(m.JWPLAYER_PLAYLIST_ITEM,
                function() {
                    F = {}
                });
                O(m.JWPLAYER_MEDIA_META,
                function(U) {
                    k.extend(F, U.metadata)
                });
                O(m.JWPLAYER_VIEW_TAB_FOCUS,
                function(V) {
                    var U = K.getContainer();
                    if (V.hasFocus === true) {
                        j(U)
                    } else {
                        d(U)
                    }
                });
                K.dispatchEvent(m.API_READY);
                while (D.length > 0) {
                    J.apply(K, D.shift())
                }
            };
            K.getItemMeta = function() {
                return F
            };
            return K
        };
        f.playerReady = function(p) {
            var o = f.api.playerById(p.id);
            if (!o) {
                o = f.api.selectPlayer(p.id)
            }
            o.playerReady(p)
        };
        f.api.selectPlayer = function(p) {
            var o;
            if (!k.exists(p)) {
                p = 0
            }
            if (p.nodeType) {
                o = p
            } else {
                if (typeof p === "string") {
                    o = document.getElementById(p)
                }
            }
            if (o) {
                var q = f.api.playerById(o.id);
                if (q) {
                    return q
                } else {
                    return (new f.api(o))
                }
            } else {
                if (typeof p === "number") {
                    return b[p]
                }
            }
            return null
        };
        f.api.playerById = function(q) {
            for (var o = 0; o < b.length; o++) {
                if (b[o].id === q) {
                    return b[o]
                }
            }
            return null
        };
        f.api.addPlayer = function(o) {
            for (var q = 0; q < b.length; q++) {
                if (b[q] === o) {
                    return o
                }
            }
            i++;
            o.uniqueId = i;
            b.push(o);
            return o
        };
        f.api.destroyPlayer = function(p) {
            var o = l.where(b, {
                id: p
            });
            l.each(o, l.partial(l.result, l, "remove"))
        }
    })(window.jwplayer); (function(c) {
        var d = c.events,
        a = c.utils,
        b = d.state;
        c.api.instream = function(j, e) {
            var i, k, h = {},
            o = {},
            f = this;
            function m(q, p) {
                e.jwInstreamAddEventListener(p, 'function(dat) { jwplayer("' + q + '").dispatchInstreamEvent("' + p + '", dat); }')
            }
            function g(p, q) {
                if (!h[p]) {
                    h[p] = [];
                    m(j.id, p)
                }
                h[p].push(q);
                return this
            }
            function n(p, q) {
                if (!o[p]) {
                    o[p] = [];
                    g(d.JWPLAYER_PLAYER_STATE, l(p))
                }
                o[p].push(q);
                return this
            }
            function l(p) {
                return function(r) {
                    var q = r.newstate,
                    u = r.oldstate;
                    if (q === p) {
                        var t = o[q];
                        if (t) {
                            for (var v = 0; v < t.length; v++) {
                                var s = t[v];
                                if (typeof s === "function") {
                                    s.call(this, {
                                        oldstate: u,
                                        newstate: q,
                                        type: r.type
                                    })
                                }
                            }
                        }
                    }
                }
            }
            f.type = "instream";
            f.init = function() {
                j.callInternal("jwInitInstream");
                return f
            };
            f.loadItem = function(q, p) {
                i = q;
                k = p || {};
                if (a.typeOf(q) === "array") {
                    j.callInternal("jwLoadArrayInstream", i, k)
                } else {
                    j.callInternal("jwLoadItemInstream", i, k)
                }
            };
            f.removeEvents = function() {
                h = o = {}
            };
            f.removeEventListener = function(r, s) {
                var q = h[r];
                if (q) {
                    for (var p = q.length; p--;) {
                        if (q[p] === s) {
                            q.splice(p, 1)
                        }
                    }
                }
            };
            f.dispatchEvent = function(u, t) {
                var s = h[u];
                if (s) {
                    s = s.slice(0);
                    var q = a.translateEventResponse(u, t[1]);
                    for (var p = 0; p < s.length; p++) {
                        var r = s[p];
                        if (typeof r === "function") {
                            r.call(this, q)
                        }
                    }
                }
            };
            f.onError = function(p) {
                return g(d.JWPLAYER_ERROR, p)
            };
            f.onMediaError = function(p) {
                return g(d.JWPLAYER_MEDIA_ERROR, p)
            };
            f.onFullscreen = function(p) {
                return g(d.JWPLAYER_FULLSCREEN, p)
            };
            f.onMeta = function(p) {
                return g(d.JWPLAYER_MEDIA_META, p)
            };
            f.onMute = function(p) {
                return g(d.JWPLAYER_MEDIA_MUTE, p)
            };
            f.onComplete = function(p) {
                return g(d.JWPLAYER_MEDIA_COMPLETE, p)
            };
            f.onPlaylistComplete = function(p) {
                return g(d.JWPLAYER_PLAYLIST_COMPLETE, p)
            };
            f.onPlaylistItem = function(p) {
                return g(d.JWPLAYER_PLAYLIST_ITEM, p)
            };
            f.onTime = function(p) {
                return g(d.JWPLAYER_MEDIA_TIME, p)
            };
            f.onBuffer = function(p) {
                return n(b.BUFFERING, p)
            };
            f.onPause = function(p) {
                return n(b.PAUSED, p)
            };
            f.onPlay = function(p) {
                return n(b.PLAYING, p)
            };
            f.onIdle = function(p) {
                return n(b.IDLE, p)
            };
            f.onClick = function(p) {
                return g(d.JWPLAYER_INSTREAM_CLICK, p)
            };
            f.onInstreamDestroyed = function(p) {
                return g(d.JWPLAYER_INSTREAM_DESTROYED, p)
            };
            f.onAdSkipped = function(p) {
                return g(d.JWPLAYER_AD_SKIPPED, p)
            };
            f.play = function(p) {
                e.jwInstreamPlay(p)
            };
            f.pause = function(p) {
                e.jwInstreamPause(p)
            };
            f.hide = function() {
                j.callInternal("jwInstreamHide")
            };
            f.destroy = function() {
                f.removeEvents();
                j.callInternal("jwInstreamDestroy")
            };
            f.setText = function(p) {
                e.jwInstreamSetText(p ? p: "")
            };
            f.getState = function() {
                return e.jwInstreamState()
            };
            f.setClick = function(p) {
                if (e.jwInstreamClick) {
                    e.jwInstreamClick(p)
                }
            }
        }
    })(jwplayer)
};