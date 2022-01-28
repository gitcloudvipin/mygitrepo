resource "aws_security_group" "allow_tls" {
      name = "allow_tls"
      description = "allow https traffic"
      ingress {
         description = " this is inbound rule for 443"
         from_port = 443
         to_port = 443
         protocol = "tcp"
         cidr_blocks = ["192.168.10.0/26"]
             }
      egress {
         description = " this is outbound rule"
         from_port = 0
         to_port = 0
         protocol = "-1"
         cidr_blocks = ["0.0.0.0/0"]
           }
}
