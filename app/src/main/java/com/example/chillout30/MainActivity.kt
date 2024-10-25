package com.example.chillout30

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val days = listOf(
            Day(1, "Welcome to Chill Out 30!",
                "Take a few moments to set an intention for the next 30 days. Reflect on why you’re here and how you want to feel. Start by taking 5 deep breaths to center yourself.",
                R.drawable.day1),

            Day(2, "Unplug & Unwind",
                "Spend at least one hour today without any digital distractions. Use this time to journal or simply relax with a book. Reconnect with yourself away from the noise of technology.",
                R.drawable.day2),

            Day(3, "Mindful Breathing",
                "Pause for a few minutes and practice mindful breathing. Focus on your breath, inhaling deeply for 4 counts, holding for 4 counts, and exhaling for 4 counts. This will help calm your mind and reduce stress.",
                R.drawable.day3),

            Day(4, "Gratitude Reflection",
                "Start your day by writing down three things you are grateful for. Focusing on gratitude can shift your mindset and help you appreciate the positives in your life.",
                R.drawable.day4),

            Day(5, "Soothing Sounds",
                "Listen to the calming sounds of nature, allowing the gentle rhythm to wash away stress. If possible, go outside to listen to the natural sounds around you.",
                R.drawable.day5),

            Day(6, "Deep Breathing",
                "Practice deep breathing exercises to reduce tension and clear your mind.",
                R.drawable.day6),

            Day(7, "Gratitude Practice",
                "Write down three things you are grateful for today. Reflect on the positive aspects of your life.",
                R.drawable.day7),

            Day(8, "Digital Detox",
                "Take a break from social media and digital distractions for a full day.",
                R.drawable.day8),

            Day(9, "Gentle Movement",
                "Engage in gentle stretching or yoga to relax your body and ease muscle tension.",
                R.drawable.day9),

            Day(10, "Creative Expression",
                "Spend some time drawing, painting, or writing as a way to express your feelings and release stress.",
                R.drawable.day10),

            Day(11, "Positive Affirmations",
                "Start the day by repeating positive affirmations to boost your mood and confidence.",
                R.drawable.day11),

            Day(12, "Body Scan Meditation",
                "Do a body scan meditation to relax and release any tension held in your body.",
                R.drawable.day12),

            Day(13, "Fresh Air Break",
                "Take a break outside and enjoy the fresh air for a few minutes to recharge your energy.",
                R.drawable.day13),

            Day(14, "Hydration Check",
                "Drink plenty of water throughout the day and notice how it revitalizes your body.",
                R.drawable.day14),

            Day(15, "Focus on Sleep",
                "Establish a bedtime routine to improve the quality of your sleep. Wind down with calming activities.",
                R.drawable.day15),

            Day(16, "Mindful Eating",
                "Pay attention to the flavors and textures of your food as you eat, savoring each bite slowly.",
                R.drawable.day16),

            Day(17, "Journaling",
                "Write down your thoughts and feelings to clear your mind and process your emotions.",
                R.drawable.day17),

            Day(18, "Connecting with Loved Ones",
                "Reach out to a friend or family member to share a meaningful conversation.",
                R.drawable.day18),

            Day(19, "Guided Meditation",
                "Follow a guided meditation to help relax your mind and body.",
                R.drawable.day19),

            Day(20, "Aromatherapy",
                "Use calming essential oils like lavender or eucalyptus to create a peaceful environment.",
                R.drawable.day20),

            Day(21, "Mindful Walking",
                "Take a slow, mindful walk, paying attention to the sensation of your feet on the ground.",
                R.drawable.day21),

            Day(22, "Sunlight Therapy",
                "Spend time outside in the sunlight to boost your mood and energy.",
                R.drawable.day22),

            Day(23, "Decluttering",
                "Tidy up a small area of your living space to create a more peaceful environment.",
                R.drawable.day23),

            Day(24, "Self-Compassion",
                "Practice self-compassion by speaking kindly to yourself and letting go of self-criticism.",
                R.drawable.day24),

            Day(25, "Music Therapy",
                "Listen to calming or uplifting music to improve your mood and reduce stress.",
                R.drawable.day25),

            Day(26, "Scented Bath",
                "Take a warm bath with soothing scents like lavender or chamomile to relax your body.",
                R.drawable.day26),

            Day(27, "Visualize Calm",
                "Close your eyes and imagine a peaceful place where you feel calm and safe.",
                R.drawable.day27),

            Day(28, "Gentle Touch",
                "Give yourself a gentle hand or foot massage to release stress and tension.",
                R.drawable.day28),

            Day(29, "Disconnect & Recharge",
                "Unplug from technology and spend the day focusing on recharging your energy.",
                R.drawable.day29),

            Day(30, "Reflect & Celebrate",
                "Take time to reflect on your journey and celebrate the calm and peace you've cultivated over the past 30 days.",
                R.drawable.day30)
        )


        adapter = ListAdapter(this, days)
        recyclerView.adapter = adapter
    }
}
