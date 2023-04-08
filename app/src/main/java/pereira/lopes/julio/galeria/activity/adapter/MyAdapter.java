package pereira.lopes.julio.galeria.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pereira.lopes.julio.galeria.R;
import pereira.lopes.julio.galeria.activity.model.MyItem;
import pereira.lopes.julio.galeria.activity.activity.MainActivity;
import pereira.lopes.julio.lista.R;

public class MyAdapter extends RecyclerView.Adapter {
    MainActivity mainActivity;
    List<MyItem> itens;

    public MyAdapter(MainActivity mainActivity, List<MyItem> itens) {
        this.mainActivity = mainActivity;
        this.itens = itens;
    }

    @NonNull
    @Override

    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mainActivity); // Lê o arquivo xml para depois  criar os itens
        View v = inflater.inflate(R.layout.item_list,parent, false); // Cria os elementos obtendoo eles da lista
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) { //Parametros 1° os intens criados na onCreateViewHolder e 2° qual o item deve ser usado para preencher o item
        // onBindViewHolder preenche a UI com os dados de item

        MyItem myItem = itens.get(position); //pegamos o item
        View v = holder.itemView; //pegamos o view que está dento de viwholder

        //Preenchendo os dados da UI com os dados do item
        ImageView imvfoto = v.findViewById(R.id.imvPhoto);
        imvfoto.setImageURI(myItem.photo);

        TextView tvTitle = v.findViewById(R.id.tvTitle);
        tvTitle.setText(myItem.title);

        TextView tvdesc = v.findViewById(R.id.tvDesc);
        tvdesc.setText(myItem.description);
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }
}
