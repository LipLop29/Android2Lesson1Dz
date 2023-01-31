package com.example.android2lesson1dz.ui.repository

import com.example.android2lesson1dz.ui.data.Model

class SecondRepository {

    private val catModelList = mutableListOf<Model>()


    fun getListOfCinema(): MutableList<Model> {
        catModelList.add(
            Model(
                "https://thumbs.dfs.ivi.ru/storage26/contents/5/c/21c7c18bfe111e6e0ab01b43121f2c.jpg",
                "Liberia"
            )
        )
        catModelList.add(
            Model(
                "https://amc-theatres-res.cloudinary.com/v1664804476/amc-cdn/production/2/movies/56500/56467/PosterDynamic/143958.jpg",
                "Wakanda forever"
            )
        )
        catModelList.add(
            Model(
                "https://lumiere-a.akamaihd.net/v1/images/p_shangchiandthelegendofthetenringshomeentupdate_22055_7b62fa67.jpeg?region=0%2C0%2C540%2C800",
                "Shang Chi"
            )
        )
        catModelList.add(
            Model(
                "https://api.time.com/wp-content/uploads/2014/07/301386_full1.jpg",
                "Harry Potter"
            )
        )
        catModelList.add(
            Model(
                "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl" +
                        "5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_FMjpg_UX1000_.jpg", "Avengers"
            )
        )
        catModelList.add(
            Model(
                "https://lumiere-a.akamaihd.net/v1/images/p_blackpanther_" +
                        "19754_4ac13f07.jpeg?region=0%2C0%2C540%2C810", "black panther"
            )
        )
        catModelList.add(
            Model(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQL" +
                        "7te8tkGWc3_ElgjIUqDMhFyPyqIJXnacMw&usqp=CAU",
                "Puss in boots"
            )
        )
        catModelList.add(
            Model(
                "https://wehco.media.clients.ellingtoncms.com/img/photos/2021/06/" +
                        "10/homemovies_0611_rgb_t800.jpg?90232451fbcadccc64a17de7521d859a8f88077d",
                "Godzilla vs Kong"
            )
        )
        catModelList.add(
            Model(
                "https://imageio.forbes.com/specials-images/imageserve/5d8e81f66de3150009a55ea8/" +
                        "Official-poster-for-Warner-s--Joker-/960x0.jpg?format=jpg&width=960",
                "Joker"
            )
        )
        catModelList.add(
            Model(
                "https://www-s3.hoyts.com.au/movies/AU/HO00007067/poster.jpg",
                "Strange world"
            )
        )
        catModelList.add(
            Model(
                "https://lumiere-a.akamaihd.net/v1/images/ng_theterritory_keyart_" +
                        "vertical_4b14a73f.jpeg?region=0%2C0%2C1944%2C2880", "Territory"
            )
        )
        catModelList.add(
            Model(
                "https://mediafiles.cineplex.com/Central/Film/Posters/32000_768_1024.jpg",
                "Quantumania"
            )
        )
        catModelList.add(
            Model(
                "https://m.media-amazon.com/images/M/MV5BMjMwNjcxODY5OV5BMl5B" +
                        "anBnXkFtZTcwMDA1OTg4Ng@@._V1_FMjpg_UX1000_.jpg", "The Divide"
            )
        )
        catModelList.add(
            Model(
                "https://static.hdrezka.ac/i/2022/1/8/bba23ebd0fd7ayk42q64n.jpg",
                "Adel"
            )
        )
        catModelList.add(
            Model(
                "https://www.justwatch.com/images/poster/285601714/s332/uncharted",
                "Uncharted"
            )
        )

        return catModelList
    }
}