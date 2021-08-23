package org.dod.manbanjalbu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    ArrayList<Person> personCards = new ArrayList<Person>();

    // 명함 추가 함수 (추후 수정)
    public void addCard(Person card) {
        personCards.add(card);
    }

    // 해당 명함 정보 가져오기
    public Person getCardInfo(int position) {
        return personCards.get(position);
    }

    @NonNull
    @Override
    // View Holder 생성
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View personCardView = inflater.inflate(R.layout.person_card, parent, false);

        return new PersonViewHolder(personCardView);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.PersonViewHolder holder, int position) {
        Person card = personCards.get(position);
        holder.setItem(card);
    }

    @Override
    public int getItemCount() {
        return personCards.size();
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView nameView;
        TextView departmentView;
        TextView companyView;
        TextView phoneNumberView;
        TextView companyNumberView;
        TextView emailView;

        public PersonViewHolder(View itemView) {
            super(itemView);

            nameView = itemView.findViewById(R.id.nameView);
            departmentView = itemView.findViewById(R.id.departmentView);
            companyView = itemView.findViewById(R.id.companyView);
            phoneNumberView = itemView.findViewById(R.id.phoneNumberView);
            companyNumberView = itemView.findViewById(R.id.companyNumberView);
            emailView = itemView.findViewById(R.id.emailView);
        }

        public void setItem(Person card) {
            nameView.setText(card.getName());
            departmentView.setText(card.getDepartment());
            companyView.setText(card.getCompany());
            phoneNumberView.setText(card.getCompanyNumber());
            companyNumberView.setText(card.getCompanyNumber());
            emailView.setText(card.getEmail());
        }
    }
}
