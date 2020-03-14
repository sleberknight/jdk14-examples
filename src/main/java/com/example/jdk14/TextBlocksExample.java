package com.example.jdk14;

public class TextBlocksExample {

    public static void main(String[] args) {

        // Forecast data from 7Timer!
        // Website: http://www.7timer.info/index.php?lang=en
        // About: http://www.7timer.info/about.php?lang=en
        // API doc link: http://www.7timer.info/doc.php?lang=en#api

        var json = """
                {
                  "product": "astro",
                  "init": "2019101012",
                  "dataseries": [
                    {
                      "timepoint": 3,
                      "cloudcover": 4,
                      "seeing": 6,
                      "transparency": 4,
                      "lifted_index": -1,
                      "rh2m": 8,
                      "wind10m": {
                        "direction": "SW",
                        "speed": 2
                      },
                      "temp2m": 29,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 6,
                      "cloudcover": 3,
                      "seeing": 6,
                      "transparency": 4,
                      "lifted_index": -1,
                      "rh2m": 9,
                      "wind10m": {
                        "direction": "SW",
                        "speed": 2
                      },
                      "temp2m": 28,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 9,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 4,
                      "lifted_index": -1,
                      "rh2m": 9,
                      "wind10m": {
                        "direction": "SW",
                        "speed": 2
                      },
                      "temp2m": 27,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 12,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 4,
                      "lifted_index": -1,
                      "rh2m": 9,
                      "wind10m": {
                        "direction": "W",
                        "speed": 2
                      },
                      "temp2m": 28,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 15,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -4,
                      "rh2m": 6,
                      "wind10m": {
                        "direction": "W",
                        "speed": 2
                      },
                      "temp2m": 32,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 18,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 4,
                      "wind10m": {
                        "direction": "W",
                        "speed": 2
                      },
                      "temp2m": 34,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 21,
                      "cloudcover": 5,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 4,
                      "wind10m": {
                        "direction": "W",
                        "speed": 2
                      },
                      "temp2m": 34,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 24,
                      "cloudcover": 4,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 5,
                      "wind10m": {
                        "direction": "N",
                        "speed": 2
                      },
                      "temp2m": 32,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 27,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 7,
                      "wind10m": {
                        "direction": "W",
                        "speed": 2
                      },
                      "temp2m": 30,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 30,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 8,
                      "wind10m": {
                        "direction": "W",
                        "speed": 2
                      },
                      "temp2m": 29,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 33,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 4,
                      "lifted_index": -1,
                      "rh2m": 9,
                      "wind10m": {
                        "direction": "W",
                        "speed": 2
                      },
                      "temp2m": 28,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 36,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 8,
                      "wind10m": {
                        "direction": "NW",
                        "speed": 2
                      },
                      "temp2m": 29,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 39,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 5,
                      "wind10m": {
                        "direction": "NW",
                        "speed": 2
                      },
                      "temp2m": 33,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 42,
                      "cloudcover": 4,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 3,
                      "wind10m": {
                        "direction": "N",
                        "speed": 2
                      },
                      "temp2m": 34,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 45,
                      "cloudcover": 7,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -4,
                      "rh2m": 4,
                      "wind10m": {
                        "direction": "N",
                        "speed": 2
                      },
                      "temp2m": 34,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 48,
                      "cloudcover": 4,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 4,
                      "wind10m": {
                        "direction": "NE",
                        "speed": 2
                      },
                      "temp2m": 32,
                      "prec_type": "none"
                    },
                    {
                      "timepoint": 51,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 7,
                      "wind10m": {
                        "direction": "E",
                        "speed": 2
                      },
                      "temp2m": 30,
                      "prec_type": "rain"
                    },
                    {
                      "timepoint": 54,
                      "cloudcover": 3,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 8,
                      "wind10m": {
                        "direction": "NE",
                        "speed": 2
                      },
                      "temp2m": 29,
                      "prec_type": "rain"
                    },
                    {
                      "timepoint": 57,
                      "cloudcover": 1,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 8,
                      "wind10m": {
                        "direction": "NE",
                        "speed": 3
                      },
                      "temp2m": 28,
                      "prec_type": "rain"
                    },
                    {
                      "timepoint": 60,
                      "cloudcover": 2,
                      "seeing": 6,
                      "transparency": 4,
                      "lifted_index": -1,
                      "rh2m": 8,
                      "wind10m": {
                        "direction": "N",
                        "speed": 3
                      },
                      "temp2m": 28,
                      "prec_type": "rain"
                    },
                    {
                      "timepoint": 63,
                      "cloudcover": 2,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 5,
                      "wind10m": {
                        "direction": "NE",
                        "speed": 3
                      },
                      "temp2m": 32,
                      "prec_type": "rain"
                    },
                    {
                      "timepoint": 66,
                      "cloudcover": 3,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 4,
                      "wind10m": {
                        "direction": "NE",
                        "speed": 3
                      },
                      "temp2m": 34,
                      "prec_type": "rain"
                    },
                    {
                      "timepoint": 69,
                      "cloudcover": 9,
                      "seeing": 6,
                      "transparency": 3,
                      "lifted_index": -1,
                      "rh2m": 5,
                      "wind10m": {
                        "direction": "NE",
                        "speed": 3
                      },
                      "temp2m": 33,
                      "prec_type": "rain"
                    },
                    {
                      "timepoint": 72,
                      "cloudcover": 7,
                      "seeing": 6,
                      "transparency": 4,
                      "lifted_index": -1,
                      "rh2m": 8,
                      "wind10m": {
                        "direction": "NE",
                        "speed": 2
                      },
                      "temp2m": 31,
                      "prec_type": "rain"
                    }
                  ]
                }
                """;

        System.out.println("JSON forecast data:");
        System.out.println(json);
    }
}
