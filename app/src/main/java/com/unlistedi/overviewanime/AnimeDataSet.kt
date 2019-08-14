package com.unlistedi.overviewanime

import java.util.*

class AnimeDataSet(){


    var animeDataSet : LinkedList<Anime> = LinkedList()
    init {
        animeDataSet.add(Anime(
            0,
            "Grand Blue",
            "Kimitake Yoshioka, Kenji Inoue",
            "https://f01.mrcdn.info/file/mrportal/j/4/a/8/74.beaPXey3.jpg",
            "A new life begins for Kitahara Iori as he begins his college career near the ocean in Izu city, where he’ll be moving into his uncle’s diving store, “Grand Blue.” Iori is full of excitement for his college life and getting close to beautiful girls. \n However, “Grand Blue” is the attraction for the college’s diving club that’s full of rowdy and buff men that enjoy partying and drinking. Before he knows it, Iori is caught up in their shenanigans and joins the club, much to the chagrin of his cousin, Chisa, who tries to actually teach him the beauty of diving. Iori’s college life is much more lively than expected!",
            "A new life begins for Kitahara Iori as he begins his college career near the ocean in Izu city, where he’ll be moving into his uncle’s diving store, “Grand Blue.”",
            "Finished | Episode 12 | Chapter 1",
            "Ongoing | 64 Chapters",
            arrayOf("Sport", "School Life", "Commedy"),
            arrayOf(
                "Urban boy Iori Kitahara moves to the rural coast of Izu to attend university",
                "Thanks to his uncle's enthusiastic diving shop, Iori ends up trying the sea diving sport himself",
                "A funny summer-esque adventure of merry-making and antics with the members of the local Diving Club"
            )
        ))
        animeDataSet.add(Anime(
            1,
            "Kono Subarashii Sekai ni Bakuen wo",
            "Kasumi Morino, Natsume Akatsuki",
            "https://f01.mrcdn.info/file/mrportal/j/7/o/6/AR.h0weJRto.jpg",
            "Self-proclaimed hikikomori that loves gaming,Kazuma Satou’s young life has come to an abrupt end. In the afterlife, he’s approached by the beautiful goddess, Aqua, who gives him an offer of being reincarnated in his dream fantasy world. However, he must defeat the Demon King that currently terrorizes that world. \nTo give him motivation, Aqua says he can have anything he wants to bring with him. So...Kazuma chooses her! Now begins his unbelievable quest in a world of magic, where all his companions are troublesome and his enemies an even bigger pain in the butt! Is this really the world of fantasy he’s always wanted to be in?",
            "Kazuma Satou’s young life has come to an abrupt end. Afterlife, he’s approached by the beautiful goddess, Aqua.",
            "Finished | Episode 12 | Chapter 2",
            "Ongoing | 21 Chapters",
            arrayOf("Fantasy", "Seinen", "Commedy"),
            arrayOf(
                "When Kazuma loses his life, he is given a chance by the goddess Aqua to reincarnate in a new world",
                "In a surprising twist, he drags her into this new world with him, one terrorized by the Demon King",
                "An all-out comedy about living lavishly with characters that have all kinds of silly quirks"
            )
        ))
        animeDataSet.add(Anime(
            2,
            "Naruto",
            "Masashi Kishimoto",
            "https://f01.mrcdn.info/file/mrportal/j/3/8/3/nE.ffeWKPZd.jpg",
            "Whenever Naruto Uzumaki proclaims that he will someday become the Hokage—a title bestowed upon the best ninja in the Village Hidden in the Leaves—no one takes him seriously. Since his birth, Naruto has been shunned and ridiculed by his fellow villagers. However, their contempt isn't because Naruto is loud-mouthed, mischievous, and inept in the ninja arts, it is because there is a demon inside him. Before Naruto was born, the powerful and deadly Nine-Tailed Fox attacked the village. In order to stop the rampage, the Fourth Hokage sacrificed his life to seal the demon inside the body of the newborn Naruto.\n When he is assigned to Team 7 along with his new teammates Sasuke Uchiha and Sakura Haruno under the mentorship of veteran ninja Kakashi Hatake, Naruto is forced to work together with other people for the first time in his life. Through undergoing vigorous training and taking on challenging missions, Naruto must learn what it means to work in a team and carve his own route toward becoming a full-fledged ninja recognized by his village.",
        "Whenever Naruto Uzumaki proclaims that he will someday become the Hokage.",
            "Completed",
            "Finished | 700 Chapters",
            arrayOf("Fantasy", "Adventure", "Action"),
            arrayOf(
                "Naruto is a young ninja who is shunned by his fellow villagers",
                "He has the goal to be the village's Hokage and be the best ninja",
                "An exciting ninja manga series that is filled with lessons and awesome fights"
            )
        ))
        animeDataSet.add(Anime(
            3,
            "One Piece",
            "Eiichiro Oda",
            "https://f01.mrcdn.info/file/mrportal/i/4/6/5/F-.7Zl7__Px.jpg",
            "Gol D. Roger, a man referred to as the \"Pirate King,\" was set to be executed by the World Government. Right before his demise, he confirmed the existence of a great treasure called One Piece that is located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the Pirate King is executed and the Great Age of Pirates begins. \n Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new Pirate King. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas.",
            "Monkey D. Luffy is ready to embark on Pirate King's own adventure, searching for One Piece and striving to become the new Pirate King.",
            "On Going | 894 Episodes",
            "Ongoing | 953 chapters",
            arrayOf("Fantasy", "Adventure", "Action"),
            arrayOf(
                "The Pirate King confirmed the existence of the greatest treasure called One Piece.",
                "Years after the execution of the Pirate King, Monkey D.Luffy seeks to find and claim One Piece.",
                "A hero journey through an epic fantasy world, filled with action, friendship and sea battles."
            )
        ))
        animeDataSet.add(Anime(
            4,
            "Boku No Hero Academia",
            "Neda Hirofumi",
            "https://f01.mrcdn.info/file/mrportal/i/3/u/k/5q.8KFpDoE2.png",
            "One day, a four-year-old boy came to a sudden realization: the world is not fair. Eighty percent of the world's population wield special abilities, known as \"quirks,\" which have given many the power to make their childhood dreams of becoming a superhero a reality. Unfortunately, Izuku Midoriya was one of the few born without a quirk, suffering from discrimination because of it. Yet, he refuses to give up on his dream of becoming a hero; determined to do the impossible, Izuku sets his sights on the elite hero training academy, UA High. \n However, everything changes after a chance meeting with the number one hero and Izuku's idol, All Might. Discovering that his dream is not a dead end, the powerless boy undergoes special training, working harder than ever before. Eventually, this leads to him inheriting All Might's power, and with his newfound abilities, gets into his school of choice, beginning his grueling journey to become the successor of the best hero on the planet.",
            "Izuku sets his sights on the elite hero training academy, UA High.",
            "Finished | Season 3 | 24 Episodes",
            "Ongoing | 249 Chapters",
            arrayOf("Super Power", "Commedy", "Action"),
            arrayOf(
                "Where having superpowers (Quirks) is the norm, Izuku was bullied for being born with none",
                "After showing an act of courage, Izuku is granted his own Quirk by the world's greatest Hero",
                "Izuku starts his training at a school for superheroes and gets involved in battling an evil force"
            )
        ))
        animeDataSet.add(Anime(
            5,
            "One Punch-Man",
            "Yusuke Murata, ONE",
            "https://vgfiles.nabstudio.com/portal/aaedd94de0db5e6067407d69ce560167_358279_thumbnail.jpg",
            "“I’m just an average guy who serves as an average hero.”\n In a world of superheroes and villains, Saitama appears to be a plain man -- from his lifeless expression to his sluggish personality, nothing stands out. But once danger strikes, he’s an insanely powerful superhero that can take down villains with a single punch! Although his strength keeps the city safe, Saitama can’t help but grow bored with how easily his opponents are defeated. \n One day, his path crosses with the young cyborg, Genos, who wishes to be Saitama’s disciple. Thus a new chapter in Saitama’s life unfolds, opening up this action-packed seinen comedy of an average-looking man craving excitement and popularity in his “hobby” of being a superhero!",
            "In a world of superheroes and villains, Saitama appears to be a plain man -- from his lifeless expression to his sluggish personality, nothing stands out.",
            "Finished | Season 2 | 12 Episodes",
            "Ongoing | 142 chapters",
            arrayOf("Commedy", "Action", "Supernatural"),
            arrayOf(
                "Saitama can knock out literally anyone and anything with just one punch.",
                "In a world full of super beings that he can defeat, Saitama yearns to find a worthy opponent.",
                "He had also lost all his hair due to extensive training, so he's bored and bald. Comically tragic."
            )
        ))
        animeDataSet.add(Anime(
            6,
            "Haikyu!!",
            "Haruichi Furudate",
            "https://f01.mrcdn.info/file/mrportal/i/4/l/f/ME.7IS2i1sl.jpg",
            "“It's true that I'm not very tall. However! I can jump!”\n Inspired by the legendary player known as the “Little Giant,” Shouyou Hinata immerses himself in volleyball. Despite being put down because of his short stature, Hinata tirelessly trains himself and attends his first tournament with determination. Unfortunately, his team is quickly defeated almost single-handedly by Tobio Kageyama, known as the “King of the Court”. \n Refusing to give up, Hinata graduates into Karasuno High, following in the Little Giant’s footsteps. But when he opens the doors to the gym, he finds Kageyama there! The two are forced into teamwork by the other Karasuno players -- and with their skills together, they just might be able to bring Karasuno’s name back from the ashes..",
            "Inspired by the legendary player known as the “Little Giant,” Shouyou Hinata immerses himself in volleyball.",
            "Finished | Season 2 | 25 Episodes",
            "Ongoing | 385 chapters",
            arrayOf("Sport", "School Life", "Commedy"),
            arrayOf(
                "Despite being short, Hinata never gives up on playing volleyball",
                "After a defeat in his first tournament, he follows the footsteps of his idol in high school",
                "A sports manga filled with determined players and a lot of intense volleyball matches"
            )
        ))
        animeDataSet.add(Anime(
            7,
            "Eyeshield 21",
            "Haruichi Furudate",
            "https://vgfiles.nabstudio.com/portal/f4b20b7af2018b5b1dd8e80cb3d05fbd_69360.jpg",
            "Timid, diminutive, and frequently the target of bullies, Sena Kobayakawa has just enrolled at Deimon Private High School. When he angers a group of delinquents by refusing to act as their errand boy, he makes an incredibly speedy getaway, an ability he has developed through years of running from his tormentors. \n Youichi Hiruma—the demonic captain of the Deimon Devil Bats football team—happens to be nearby, and seeing Sena's \"golden legs\" at work, forcibly recruits him as a running back despite Sena's desire to be team manager instead. Made to don the number 21 jersey and a special helmet to hide his identity as a player, Sena becomes \"Eyeshield 21,\" the team's closely guarded secret weapon. Soon he realizes his love for the sport, and aims to help the Devil Bats reach the Christmas Bowl, the high school football championship.",
            "Inspired by the legendary player known as the “Little Giant,” Shouyou Hinata immerses himself in volleyball.",
            "Finished | 145 Episodes",
            "Completed | 333 chapters",
            arrayOf("Sport", "School Life", "Commedy"),
            arrayOf(
                "Timid freshman student Sena enters a high school teeming with bullies and delinquents",
                "Quick to flee from trouble, he gets recruited by the football club and put his fast legs to use",
                "A sports newbie forms camaraderie with fierce players of the Deimon Devil Bats football team"
            )
        ))
        animeDataSet.add(Anime(
            8,
            "Mob Psycho 100",
            "ONE",
            "https://vgfiles.nabstudio.com/portal/b530887cc73ef88074dedb72eb6ed8df_166025.jpg",
            "Kageyama Shigeo (a.k.a. \"Mob\") is a 8th grader with psychic abilities. He could bend spoons and lift objects with his mind from a young age, but he slowly began to withhold from using his abilities in public due to the negative attention he kept receiving. Now, the only thing he wants is to become friends with a girl in his class, Tsubomi. With his psychic \"mentor\" (who has no psychic powers), he continues his daily life, attempting to realize his purpose in life.",
            "Kageyama Shigeo (a.k.a. \"Mob\") is a 8th grader with psychic abilities.",
            "Finished | Season 2 | 12 Episode",
            "Completed | 215 chapters",
            arrayOf("Psychological", "Commedy", "Supernatural"),
            arrayOf(
                "Shigeo Kageyama, nicknamed Mob, is a silent, gifted psychic, without a concrete goal in life",
                "He works with his ‘mentor’ Reigen Arataka, a fraudulent psychic, who takes on exorcizing jobs",
                "More often than not, Reigen gets ahead of himself, pushing Shigeo to get him out of the predicament"
            )
        ))
        animeDataSet.add(Anime(
            9,
            "GTO: Great Teacher Onizuka",
            "Tohru Fujisawa",
            "https://f01.mrcdn.info/file/mrportal/i/7/6/9/je.eig17vk7.jpg",
            "Meet Eikichi Onizuka, a 22-year-old ex-biker. He's crude, foul-mouthed, and has a split-second temper. His unlikely goal: to be the Greatest High School Teacher in the World! Of course, the only reason he wants to be a teacher is so he can try to score with the hot students. But before he can become a full instructor, he's got to work as a student teacher to earn his credentials. Onizuka may think he's the toughest guy on campus, but when he meets his class full of bullies, blackmailers, and scheming sadists, he'll have to prove it!",
            "Meet Eikichi Onizuka, a 22-year-old ex-biker. He's crude, foul-mouthed, and has a split-second temper.",
            "Finished | 43 Episodes",
            "Completed | 208 chapters",
            arrayOf("Ecchi", "Commedy", "Action"),
            arrayOf(
                "Eikichi is a hot-tempered student teacher of a high school trying to earn his credentials",
                "He thinks he is the toughest guy on campus, until he meets the troublesome Class 3-4",
                "An action-packed comedy of a teacher using unusual teaching methods to help his troubled students"
            )
        ))
        animeDataSet.add(Anime(
            10,
            "Assassination Classroom",
            "Yuusei Matsui",
            "https://f01.mrcdn.info/file/mrportal/i/5/9/b/FY.fCBU9OBG.jpg",
            "In the blink of an eye, the night sky is forever changed when, with a great explosion, the moon is blasted into a permanent crescent. Confronting the governments of the world, a yellow tentacled monster boasts that it was the one responsible for the catastrophe, and in a year's time, it will do the same to Earth. Zooming around at Mach 20, the creature makes a peculiar demand: a teaching position at the prestigious Kunugigaoka Junior High School. Desperate to keep the creature in one place, the government agrees, and so the students of Class 3-E find themselves faced with an impossible task—assassinate the creature responsible for destroying the moon.\n Although the fate of the world now rests on their shoulders, the class has more personal issues to deal with. Trapped at the bottom of Kunugigaoka's hierarchical education system, they face harsh discrimination from both teachers and students alike. Defeatism abound, they don't believe themselves capable of success in daily life, let alone against a monster that surpasses the abilities of any human. But as the enigmatic creature—whom they dub Koro-sensei—educates them in both assassination and academia, the children slowly find the courage to rise up and take aim at their target: the greatest teacher the world has ever seen.",
            "A yellow tentacled monster boasts that it was the one responsible for the catastrophe, and in a year's time, it will do the same to Earth.",
            "Finished | Season 2 | 12 Episodes",
            "Completed | 190 chapters",
            arrayOf("Drama", "School Life", "Action"),
            arrayOf(
                "A creature suddenly appears and destroys the moon, and declares earth will be destroyed in one year",
                "The creature becomes a teacher and tasks his students to assassinate him and save the world",
                "The students must find their courage and challenge the greatest teacher the world has ever seen"
            )
        ))
        animeDataSet.add(Anime(
            11,
            "Kuroko no Basuke",
            "Tadatoshi Fujimaki",
            "https://f01.mrcdn.info/file/mrportal/i/6/e/5/P5.hnMcvKNs.jpg",
            "Teikou Middle School basketball club: an incredibly strong team with over one hundred members and three consecutive championship wins. Amongst their brilliant record, was a generation of five prodigies known as the \"Generation of Miracles.\" However, there was a strange rumour concerning the Generation of Miracles about one more player recognized by the five prodigies... a Phantom Sixth Player. When Kagami Taiga joins Seirin High School's basketball team, he meets Kuroko Tetsuya, a horrendously bad player. Kagami is shocked to find out that Kuroko is the rumoured sixth man of the Generation of Miracles. Not only is Kuroko terrible at everything from dribbling to shooting, but he also lacks much presence on the court that, at times, people even forget he's playing! But during games Kuroko uses that lack of presence to his advantage, specializing in passing the ball to stronger players. In order to become the best player in Japan, Kagami agrees to team up with Kuroko to defeat the other members of the Generation of Miracles.",
            "There was a strange rumour concerning the Generation of Miracles about one more player recognized by the five prodigies, a Phantom Sixth Player",
            "Finished | Season 3 | 25 Episodes",
            "Completed | 278 chapters",
            arrayOf("Sport", "School Life", "Commedy"),
            arrayOf(
                "Kuroko is a freshman basketball player at Seiren and was part of the “Generation of Miracles",
                "He was the sixth man of the “Generation of Miracles” and is highly skilled but a mystery to most",
                "Kuroko aims to defeat his former teammates and make Seiren the best basketball team in Japan"
            )
        ))
    }

    fun getList() : LinkedList<Anime> {
        return this.animeDataSet
    }
    fun getAnimeByPosition(position : Int) : Anime {
        return this.animeDataSet[position]
    }

}

