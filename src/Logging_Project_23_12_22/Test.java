//package Logging_Project_23_12_22;
//
//public class Test {
//    private void runExample(GoogleAdsClient googleAdsClient, long customerId, long labelId){
//        try(GoogleAdsServiceClient googleAdsServiceClient=googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()){
//            SearchGoogleAdsRequest request =SearchGoogleAdsRequest.newBuilder().setCustomerId(Long.toString(customerId)).setpageSize(PAGE_SIZE).setQuery("SELECT campaign.id, campaign.name, label.id,"+"FORM campaign_label WHERE label.id="+labelId+"ORDER BY campaign.id").build();
//            SearchPagedRespponse searchPagedRespponse=googleAdsServiceClient.search(request);
//            if(searchPagedRespponse.getPage().getResponse().getTotaResultsCount()>0){
//                for(GoogleAdsRow googleAdsRow:searchPagedRespponse.iterateAll()){
//                    System.out.println("campaign found with name'%s',ID %d, and label: %s.%n",googleAdsRow.getCampaign().getname),googleAdsRow.getCampaign().getId(),googleAdsRow.getLabel().getName());
//                }
//            }else {
//                System.out.println("No campaigns were found.");
//            }
//        }
//    }}
//}
