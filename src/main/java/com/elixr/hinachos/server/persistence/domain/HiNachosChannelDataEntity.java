package com.elixr.hinachos.server.persistence.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "exr_hinachos_channel_details")
public class  HiNachosChannelDataEntity extends HiNachosMasterDataModel{

}