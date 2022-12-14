package kusitms.candoit.MoramMoramServer.domain.fleaMarket.Dto;

import kusitms.candoit.MoramMoramServer.domain.fleaMarket.Entity.Fleamarket;
import kusitms.candoit.MoramMoramServer.domain.user.Dto.UserDto;
import kusitms.candoit.MoramMoramServer.domain.user.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class FleamarketDto {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class detail {
        private Long id;
        private Long officeId;
        private String mName;
        private LocalDate start;
        private LocalDate end;
        private LocalDate deadline;
        private String mNote;
        private String place;
        private String category;
        private Boolean open;
        private String mImg;
        private String count;

        public static FleamarketDto.detail response(@NotNull Fleamarket fleamarket,String count) {
            return detail.builder()
                    .id(fleamarket.getId())
                    .officeId(fleamarket.getOfficeId())
                    .mName(fleamarket.getMarketName())
                    .start(fleamarket.getStart())
                    .end(fleamarket.getEnd())
                    .deadline(fleamarket.getDeadline())
                    .mNote(fleamarket.getMNote())
                    .place(fleamarket.getPlace())
                    .category(fleamarket.getCategory())
                    .open(fleamarket.getOpen())
                    .mImg(fleamarket.getMImg())
                    .count(count)
                    .build();
        }
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class like{
        private Long marketId;
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class hostpost_add{
        private Long id;
        private Long officeid;
        private String mname;
        private LocalDate start;
        private LocalDate end;
        private LocalDate deadline;
        private String mnote;
        private String place;
        private String category;
        private Boolean open;
        private String mimg;
        private String count;
    }

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class hostpost_edit{
        private Long id;
        private String mname;
        private LocalDate start;
        private LocalDate end;
        private LocalDate deadline;
        private String mnote;
        private String place;
        private String category;
        private Boolean open;
        private String mimg;
        private String count;
    }
}
