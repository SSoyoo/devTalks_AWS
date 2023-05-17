package com.teamproject.devTalks.repository.recommendation;

import com.teamproject.devTalks.entity.primaryKey.recommendation.RecommendationPk;
import com.teamproject.devTalks.entity.recommendation.RecommendationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommendationRepository extends JpaRepository<RecommendationEntity, RecommendationPk> {

   public boolean existsBySenderUserNumberAndReceiverUserNumber(int senderId,int receiverId);
   public RecommendationEntity findBySenderUserNumberAndReceiverUserNumber(int senderId,int receiverId);

   public List<RecommendationEntity> findBySenderUserNumber(int SenderId);
   public List<RecommendationEntity> findByReceiverUserNumber(int receiverId);

}
