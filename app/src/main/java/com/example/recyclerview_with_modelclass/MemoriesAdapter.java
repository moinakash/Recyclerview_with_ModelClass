package com.example.recyclerview_with_modelclass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class MemoriesAdapter extends RecyclerView.Adapter<MemoriesAdapter.ViewHolder> {

    private List<Memories_modelCLass> memories_modelCLasses;
    private Context context;

    public MemoriesAdapter(List<Memories_modelCLass> Memories_modelCLass, Context context) {
        memories_modelCLasses = Memories_modelCLass;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.memories_items_list,parent,false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Memories_modelCLass modelclass = memories_modelCLasses.get(position);

        holder.Profile_Name.setText(modelclass.getProfile_Name());
        holder.Memories_title.setText(modelclass.getMemories_Title());
        holder.Memories_dteails.setText(modelclass.getMemories_Details());

        holder.Count_likes.setText(modelclass.getCount_likes());
        holder.Count_Comments.setText(modelclass.getCount_comments());
        holder.COunt_shares.setText(modelclass.getCount_shares());

        holder.ProfileImg.setImageResource(modelclass.getProfile_img());
        holder.Img1.setImageResource(modelclass.getImg1());
        holder.Img2.setImageResource(modelclass.getImg2());
        holder.Img3.setImageResource(modelclass.getImg3());
        holder.Img4.setImageResource(modelclass.getImg4());


    }

    @Override
    public int getItemCount() {
        return memories_modelCLasses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView Profile_Name,Memories_title,Memories_dteails,Count_likes,Count_Comments,COunt_shares;
        public Button Like,Comment,Share;
        public CircularImageView ProfileImg;
        public ImageView Img1,Img2,Img3,Img4;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Profile_Name = (TextView) itemView.findViewById(R.id.idProfileName);
            Memories_title = (TextView) itemView.findViewById(R.id.idMemoriesTitle);
            Memories_dteails = (TextView) itemView.findViewById(R.id.idMemoriesDetails);
            Count_likes = (TextView) itemView.findViewById(R.id.idMemories_Count_likes);
            Count_Comments = (TextView) itemView.findViewById(R.id.idMemories_Count_Comments);
            COunt_shares = (TextView) itemView.findViewById(R.id.idMemories_Count_Shares);

            Like = (Button) itemView.findViewById(R.id.idMemories_like);
            Comment = (Button) itemView.findViewById(R.id.idMemories_comment);
            Share = (Button) itemView.findViewById(R.id.idMemories_share);

            ProfileImg = (CircularImageView) itemView.findViewById(R.id.idMemories_profile);
            Img1 = (ImageView) itemView.findViewById(R.id.idMemories_img1);
            Img2 = (ImageView) itemView.findViewById(R.id.idMemories_img2);
            Img3 = (ImageView) itemView.findViewById(R.id.idMemories_img3);
            Img4 = (ImageView) itemView.findViewById(R.id.idMemories_img4);
        }
    }
}
