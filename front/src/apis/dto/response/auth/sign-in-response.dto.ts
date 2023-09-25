import ResponseDto from "..";

export default interface SignUpResponseDto extends ResponseDto {
    token: string;
    expirationTime: number;
    

}