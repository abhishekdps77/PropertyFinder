package com.example.propertyfinderapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        backButton.setOnClickListener{ finish() }

        val intent=intent
        val extras=intent.extras

        val title=extras!!.getString("titlesKey")
        titleTextView.text=title.toString()

        val description=extras!!.getString("descriptionsKey")
        descriptionTextView.text=description.toString()

        val beds=extras!!.getInt("bedsKey")
        bedroomsTextView.text=beds.toString()

        val baths=extras!!.getInt("bathsKey")
        bathroomsTextView.text=baths.toString()

        val builts=extras!!.getInt("builtKey")
        builtTextView.text=builts.toString()

        val images=extras!!.getIntegerArrayList("imagesKey")

        var index=0
        imageView.setImageResource(images!![index])

        imageView.setOnClickListener{
            index++
            if(index==images.size)
                index=0
            imageView.setImageResource(images!![index])
        }

    }
}

