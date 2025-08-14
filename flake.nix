{
  description = "Flake for Object Oriented Applications from Uninove mentored by Edson Melo";

  inputs = {
    nixpkgs.url = "github:nixos/nixpkgs?ref=nixos-unstable";
  };

  outputs = { self, nixpkgs }:
   {
    devShells = 
    let
      pkgs = import nixpkgs { system = "x86_64-linux"; }; 
    in
     { 
      x86_64-linux.default = pkgs.mkShell {
        packages = with pkgs; [ jdk8 ];

        shellHook = "o/";
      };
    };
  };
}
