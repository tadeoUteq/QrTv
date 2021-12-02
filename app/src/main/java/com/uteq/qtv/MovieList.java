package com.uteq.qtv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Naturaleza I",
            "Naturaleza II",
            "Naturaleza III",
            "Naturaleza IV",
            "Naturaleza V",
            "Naturaleza VI",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Cascada",
                "En el bosque",
                "Un par de flores y patos",
                "Si todas las flores",
                "Como agua para relajar"
        };

        String description = "Disfrutemos de la naturaleza y maravillemonos con ella!";
        String studio[] = {
                "Tribu de Agua", "Forest Cast", "Naturaleza Wild", "Reino de Flores", "Charco Corp"
        };
        String videoUrl[] = {
                "https://static.videezy.com/system/resources/previews/000/004/199/original/A_large_rock_waterfall.mp4",
                "https://static.videezy.com/system/resources/previews/000/004/277/original/1.mp4",
                "https://static.videezy.com/system/resources/previews/000/044/061/original/Lotus_Flowers_and_Leaves_on_Water_and_Duck_1.mp4",
                "https://static.videezy.com/system/resources/previews/000/007/468/original/flowers.mp4",
                "https://static.videezy.com/system/resources/previews/000/035/380/original/002_02.mp4"
        };
        String bgImageUrl[] = {
                "https://as1.ftcdn.net/v2/jpg/02/86/72/18/1000_F_286721823_jX2eKauNsttWhIxKAzPYhHwYpSRTCdcm.jpg",
                "https://as2.ftcdn.net/v2/jpg/02/55/17/43/1000_F_255174366_ojDuATz84e5h7lIlxh2moUJa9Kpd5wKk.jpg",
                "https://as1.ftcdn.net/v2/jpg/03/66/00/46/1000_F_366004680_zLHFkndvJGXI78OltQ1KFRq53yPeRsdH.jpg",
                "https://as1.ftcdn.net/v2/jpg/01/32/51/30/1000_F_132513093_ttwOz7oUQwN9rAhDeaPP2zSlEH5jWHbG.jpg",
                "https://as1.ftcdn.net/v2/jpg/01/54/15/30/1000_F_154153098_8s3pQS0OC9b64NUe7Km3eQuWf5Epk9Bj.jpg",
        };
        String cardImageUrl[] = {
                "https://as2.ftcdn.net/v2/jpg/01/31/89/13/1000_F_131891333_YtJeWozj269tpiWnwz4vBkCBe7h26qNU.jpg",
                "https://as2.ftcdn.net/v2/jpg/02/01/80/31/1000_F_201803112_4DgiXEg8iiJT1QTQ9YN6dOdvaEai0N1v.jpg",
                "https://as1.ftcdn.net/v2/jpg/03/51/27/12/1000_F_351271224_MSXwv4oBRevrp8ECP0YS4VVhPTHl0GsC.jpg",
                "https://as2.ftcdn.net/v2/jpg/00/79/96/39/1000_F_79963955_y7v0AdHytQOnA95gGR5w330qdEZxBduz.jpg",
                "https://as2.ftcdn.net/v2/jpg/00/79/96/39/1000_F_79963955_y7v0AdHytQOnA95gGR5w330qdEZxBduz.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}